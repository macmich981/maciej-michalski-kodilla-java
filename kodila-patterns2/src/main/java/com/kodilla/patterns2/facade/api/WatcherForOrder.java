package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class WatcherForOrder {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherForOrder.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    private void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + " generating order with itmes ID: " + order.getItems()
                .stream().map(item -> item.getProductId().toString()).collect(Collectors.joining(", ")) + " for user ID: " + userId);
    }
}
