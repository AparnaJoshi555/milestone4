package com.milestone4.Jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/milestone")
    public String milestone() {
        return " Milestone 4 ";
    }
}
