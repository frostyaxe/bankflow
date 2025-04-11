package com.github.bankflow;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankflowController 
{
    @RequestMapping("/")
    public String hello() 
    {
        return "Hello from frostyaxe";
    }
}