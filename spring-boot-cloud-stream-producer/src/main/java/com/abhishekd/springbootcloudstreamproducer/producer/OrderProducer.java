package com.abhishekd.springbootcloudstreamproducer.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

/**
 * Order Producer
 */
@Component
@EnableBinding(OrderSource.class)
public class OrderProducer {
}
