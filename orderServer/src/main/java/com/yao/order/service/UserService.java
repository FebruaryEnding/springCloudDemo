package com.yao.order.service;

import com.yao.order.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userServer")
@Service
public interface UserService {

    @GetMapping("/user/{id}")
    public UserDTO findOne(@PathVariable("id") String id);
}
