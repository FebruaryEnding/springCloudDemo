package com.yao.order.service;

import com.yao.order.dto.OrderResponseDTO;
import com.yao.order.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public OrderResponseDTO findOne(String orderId) {
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setId(orderId);
        orderResponseDTO.setOrderName(orderId);
        String url = "http://userserver/user/user/" + orderId;
        UserDTO forObject = restTemplate.getForObject(url, UserDTO.class);
        orderResponseDTO.setUser(forObject);
        return orderResponseDTO;
    }
}
