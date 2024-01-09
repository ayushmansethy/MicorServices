package com.ayush.contactservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class WebController {
    @GetMapping
    public  String intro(){
        return "this is contact service running on 8082";
    }
    
}
