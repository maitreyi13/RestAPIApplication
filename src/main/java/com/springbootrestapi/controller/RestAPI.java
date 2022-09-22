package com.springbootrestapi.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPI {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String welcome(){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
    //Use GET Request Method and pass name as query parameter
    @GetMapping("/query")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Mark") String name)
    {
        return "Hello! " + name + " From BridgeLabz!!";
    }
    //Use GET Request Method and pass name as path variable
    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "<h1><font color=orange>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=green>Passing name as a path variable.</font>";
    }
}
