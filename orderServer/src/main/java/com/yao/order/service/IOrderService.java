package com.yao.order.service;

import com.yao.order.dto.OrderResponseDTO;

public interface IOrderService {

    OrderResponseDTO findOne(String orderId);
}
