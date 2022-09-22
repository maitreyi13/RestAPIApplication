package com.springbootrestapi.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPI {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String welcome(){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
    @RequestMapping(value = {"/greet/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "Hello, " + name + " from BridgeLabz!!";
    }
}
