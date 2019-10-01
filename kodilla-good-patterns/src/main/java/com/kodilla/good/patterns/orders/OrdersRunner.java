package com.kodilla.good.patterns.orders;

public class OrdersRunner {
        public static void main(String[] args) {
            OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
            OrderRequest orderRequest = orderRequestRetriever.retrieve();

            OrderProcessor processor = new OrderProcessor(new SMSService(),
                    new ExampleOrderService(), new ExampleOrderRepository());
            OrderProcessResult result = processor.process(orderRequest);
        }
}
