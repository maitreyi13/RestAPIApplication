package com.springbootrestapi.controller;

import com.springbootrestapi.model.Entity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPI {
    @RequestMapping(value = {"","/","/home"}, method = RequestMethod.GET)
    public String welcome(){
        return "<h1>Hello From BridgeLabz!!</h1>";
    }
    //Use GET Request Method and pass name as query parameter
    @GetMapping("/query")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return "<h1> Hello! " + name + " From BridgeLabz!!</h1>";
    }
    //Use GET Request Method and pass name as path variable
    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String greet(@PathVariable String name) {
        return "<h1><font color=orange>Hello! " + name + " From BridgeLabz!!</font></h1>" +
                "</br> <font color=green>Passing name as a path variable.</font>";
    }
    //Use POST Request Method and pass first name and last name in the Body
    @PostMapping("/post")
    public String post(@RequestBody Entity entity) {
        return "</h1>Hello " + entity.getFirstName() + " "+  entity.getLastName() + "!</h1>";
    }
}
