package com.kveola13.springsecuritytutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @RequestMapping("/resource")
    public String resource() {
        return "You've acquired the resource";
    }
}
