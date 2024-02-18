package com.hefnawy.Belhana;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("belhana")
public class BelhanaController {
    private final String defaultClientName = "Our Client";

    @GetMapping("hello")
    public String hello(@RequestParam(name = "clientName", defaultValue = defaultClientName) String clientName){
        return "Hello " + clientName;
    }
}
