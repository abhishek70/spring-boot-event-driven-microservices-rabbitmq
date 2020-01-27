package com.abhishekd.springbootcloudstreamconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Payment Controller
 */
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{paymentId}")
    public String get(@PathVariable Long paymentId) {
        return "Payment details for " + paymentId;
    }
}
