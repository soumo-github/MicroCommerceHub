package com.soumalya.project.service;

import com.soumalya.project.model.PaymentRequest;
import com.soumalya.project.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
