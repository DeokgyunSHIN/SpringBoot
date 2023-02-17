package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 해당 클래스는 rest API 처리하는 컨트롤러
@RequestMapping("/api")  // RequestMapping URI 를 지정해주는 Annotation
public class APiController {


    @GetMapping("hello")  // http://8080/api/hello
    public String hello(){
        return "hello spring boot!";
    }
}
