package com.qugates.crud_operations.controller;
@Controller
public class MyController {
    @GetMapping("/")
    public String loadmain()
    {
        return "signup.html";
    }

    @GetMapping("/")
    public String loadmain1()
    {
        return "Login1.html";
    }

    @GetMapping("/")

    
}
