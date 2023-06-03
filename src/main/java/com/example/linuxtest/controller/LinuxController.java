package com.example.linuxtest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class LinuxController {

    @GetMapping
    public String hello(){
        System.out.println("linux 测试。。。");
        return "OK";
    }
}
