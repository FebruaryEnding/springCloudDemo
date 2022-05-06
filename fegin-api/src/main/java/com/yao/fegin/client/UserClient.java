package com.yao.fegin.client;

import com.yao.fegin.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userServer")
@Service
public interface UserClient {

    @GetMapping("/user/{id}")
    public UserDTO findOne(@PathVariable("id") String id);
}
