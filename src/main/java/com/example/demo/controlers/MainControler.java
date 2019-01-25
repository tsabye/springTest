package com.example.demo.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControler {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/oskar")
    @ResponseBody
    public String oskar(){
        return "Hello World with Oskar";
    }

}
