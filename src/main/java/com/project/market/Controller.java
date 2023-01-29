package com.project.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/hi")
    public String saludar() {
        return "TEST MESSAGE TO SHOW  🚀";
    }
}