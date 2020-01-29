package com.abhishekd.springbootcloudstreamconsumer.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * Order Listener
 */
@Component
@EnableBinding(Sink.class)
public class OrderListener {

    /**
     * Method for processing an order
     * @param orderId
     */
    @StreamListener(target = Sink.INPUT)
    public void processOrder(Long orderId){
        System.out.println("Payment processing for order Id : "+orderId);
    }
}
