package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    // 옛날 방식
    @RequestMapping( path ="/hi", method= RequestMethod.GET) // 메소드를 지정하지 않으면 모두가 다 연결이 된다.
    public String getHi(){
    return "hi";
    }



    // http://localhost:8080/api/get/path-variable/{name}

    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name="id") String pathId){

        System.out.println("PathVariable :"+pathId);
        return pathId;
    }

    //http:localhost:8080/api/get/query-param?user=sdg99018&email=sdg99018@naver.com

    @GetMapping(path="query-param")
    public String queryParam(@RequestParam  Map<String,String> queryParam){

        StringBuilder sb=new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = "+ entry.getValue()+ "\n");
        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String user, @RequestParam String email){

        System.out.println(user);
        System.out.println(email);
        return user+" "+email;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getUser());
        System.out.println(userRequest.getEmail());

        return userRequest.toString();
    }
}
