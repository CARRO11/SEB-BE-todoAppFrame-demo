package com.SEBBEtodoAppFrame.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    //branch practice
    public String hello(){
        return "To do Application !";
        //branch
    }
}
