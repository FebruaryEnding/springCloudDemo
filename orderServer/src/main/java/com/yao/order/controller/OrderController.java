package com.yao.order.controller;

import com.yao.order.dto.OrderResponseDTO;
import com.yao.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("{id}")
    public OrderResponseDTO getOrder(@PathVariable("id")String id){
        return orderService.findOne(id);
    }
}
