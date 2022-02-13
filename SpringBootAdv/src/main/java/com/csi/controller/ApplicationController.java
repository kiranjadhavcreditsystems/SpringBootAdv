package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayWelcome()
    {
        return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/address")
    public String sayCSIAddress()
    {
        return "INSPIRIA MALL |  PUNE";
    }

    @GetMapping("/services")
    public String services()
    {
        return "SOFTWARE DEVELOPMENT";
    }
}
