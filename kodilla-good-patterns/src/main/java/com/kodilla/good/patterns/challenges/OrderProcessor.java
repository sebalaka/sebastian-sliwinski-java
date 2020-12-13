package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final User user, final String productName, final LocalDateTime orderDate, final LocalDateTime deliveryDate) {
        boolean isOrdered = orderService.order(user, productName, orderDate, deliveryDate);
        if (isOrdered) {
            informationService.inform(user);
            orderRepository.createOrder(user, productName, orderDate, deliveryDate);
            return new OrderDto(user, true);
        } else {
            return new OrderDto(user, false);
        }
    }
}