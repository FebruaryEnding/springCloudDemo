package com.yao.order.service;

import com.yao.order.dto.OrderResponseDTO;
import com.yao.order.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;


    @Override
    public OrderResponseDTO findOne(String orderId) {
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setId(orderId);
        orderResponseDTO.setOrderName(orderId);
        UserDTO one = userService.findOne(orderId);
//        String url = "http://userServer/user/user/" + orderId;
//        UserDTO forObject = restTemplate.getForObject(url, UserDTO.class);
        orderResponseDTO.setUser(one);
        return orderResponseDTO;
    }
}
