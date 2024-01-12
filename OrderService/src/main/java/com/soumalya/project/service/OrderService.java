package com.soumalya.project.service;


import com.soumalya.project.model.OrderRequest;
import com.soumalya.project.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
