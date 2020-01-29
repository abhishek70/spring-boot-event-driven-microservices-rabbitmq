package com.abhishekd.springbootcloudstreamproducer.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Order Source
 * Creating a channel
 */
public interface OrderSource {

    /**
     * Method for place order on the channel
     */
    @Output("orders")
    MessageChannel placeOrder();
}
