package com.example.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")

    public String hello(){
        return "西装配玫瑰 美女一大堆";
    }

    @PostMapping("/xi")
    public String ji(){
        return "嘻嘻嘻嘻嘻";
    }


}
