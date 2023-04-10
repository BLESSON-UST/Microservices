package com.UST.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FallBackMethodController {
    @GetMapping("/userServiceFallbackMethod")
    public String userServiceFallbackMethod(){
        return "please be patient while we are working on it";
    }

    @GetMapping("/departmentServiceFallbackMethod")
    public String departmentServiceFallbackMethod(){
        return "please be patient while we are working on it";
    }
}
