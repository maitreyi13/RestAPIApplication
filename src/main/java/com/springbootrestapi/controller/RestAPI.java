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
}
