package com.demo.getname.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetNameController {

    @GetMapping("/getname")
    public String name() {
        return "Hello, Welcome to JSP";
    }

}