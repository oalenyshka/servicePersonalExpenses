package com.example.servicePersonalExpenses;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SimpleController {

    @GetMapping(value = "/time")
    public String getTime() {
        return "Текущее время: " + new Date();
    }
}
