package com.ayush.employeeservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// @FeignClient(url = "lb://CONTACT-SERVICE",value = "contactClient")
@FeignClient(name =  "CONTACT-SERVICE")
public interface ContactClient  {
    @GetMapping("/contact")
    public String giveVal() ;
}
