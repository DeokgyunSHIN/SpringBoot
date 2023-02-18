package com.example.response.Controller;

import com.example.response.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntity
    @ResponseBody
    @GetMapping("/user")
    public UserDto user(){

        var dto=new UserDto();
        dto.setName("신덕균");
        dto.setAddress("서울");
        return dto;
    }
}
