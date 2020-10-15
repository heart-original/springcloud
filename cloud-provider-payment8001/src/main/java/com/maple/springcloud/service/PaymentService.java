package com.maple.springcloud.service;

import com.maple.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
