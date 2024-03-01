package com.ethdc.FirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @GetMapping("/helloMessage")
    public String m1(){
        return "Hello Spring Boot!!";
    }

}
