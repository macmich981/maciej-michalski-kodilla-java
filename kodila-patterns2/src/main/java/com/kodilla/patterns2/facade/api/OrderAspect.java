package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class OrderAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderAspect.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(orderFacade)")
    private void logEvent(OrderDto order, Long userId, OrderFacade orderFacade) {

        String itemsIds = order.getItems().stream()
        .map(item -> item.getProductId()
        .toString())
        .collect(Collectors.joining(", "));

        LOGGER.info("Class: " + orderFacade.getClass().getName() + " generating order with itmes ID: " +
                 itemsIds + " for user ID: " + userId);
    }
}
