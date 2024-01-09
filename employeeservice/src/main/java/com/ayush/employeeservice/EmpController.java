package com.ayush.employeeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    ContactClient contactClient ;

    public EmpController(ContactClient contactClient) {
        this.contactClient = contactClient;
    }

    @GetMapping
    public String intro(){

        String value = contactClient.giveVal() ;
        return "this is emp service and running on 8081   "+value;
    }
    
}
