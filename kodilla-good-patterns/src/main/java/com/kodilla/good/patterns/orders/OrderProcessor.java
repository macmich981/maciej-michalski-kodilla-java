package com.kodilla.good.patterns.orders;

public final class OrderProcessor {
    private final InformationService infoService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(InformationService infoService, OrderService orderService, OrderRepository orderRepository) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderProcessResult process(final OrderRequest request) {
        Order order = orderService.order(request);
        return new OrderProcessResult(order, infoService.inform(order), orderRepository.create(order));
    }
}
