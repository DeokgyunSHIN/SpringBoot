package com.example.put.Controller;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public  PostRequestDto put(@RequestBody PostRequestDto postRequestDto, @PathVariable String userId){

        System.out.println(postRequestDto+"userid: "+userId);
        System.out.println(userId);

        return postRequestDto;
    }
}
