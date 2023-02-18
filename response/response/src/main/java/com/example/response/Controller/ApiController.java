package com.example.response.Controller;

import com.example.response.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // text
    @GetMapping("/text")
    public String test(@RequestParam String account){
        return account;
    }

    //JSON
    // 동작 순서 : request -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto user){
      return user;
    }


     //ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<UserDto> put(@RequestBody UserDto dto){

      return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
