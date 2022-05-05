package com.yao.order.controller;

import com.yao.order.dto.OrderResponseDTO;
import com.yao.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
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
    public OrderResponseDTO getOrder(@PathVariable("id") String id) {
        return orderService.findOne(id);
    }

    @GetMapping("async/{id}")
    public OrderResponseDTO asyncGetOrder(@PathVariable("id") String id) {
        OrderResponseDTO one = orderService.findOne(id);
        test();
        System.out.println("return");
        return one;
    }

    @Async
    public void test() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("end");
            }
        }).start();
    }
}
