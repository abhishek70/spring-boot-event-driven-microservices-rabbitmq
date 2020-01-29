package com.abhishekd.springbootcloudstreamproducer.controller;

import com.abhishekd.springbootcloudstreamproducer.producer.OrderSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Order Controller
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    /**
     * OrderSource
     */
    final OrderSource orderSource;

    /**
     * Constructor
     * @param orderSource
     */
    public OrderController(OrderSource orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * Method for placing an order
     * @param orderId
     * @return
     */
    @GetMapping("/{orderId}")
    public String placeOrder(@PathVariable Long orderId){
        this.orderSource.placeOrder().send(MessageBuilder.withPayload(orderId).build());
        System.out.println("Placing an order : "+orderId);
        return "Request placed for order id : "+ orderId;
    }
}
