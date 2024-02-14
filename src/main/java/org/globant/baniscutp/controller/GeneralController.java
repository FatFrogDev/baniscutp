package org.globant.baniscutp.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralController {

    @GetMapping("")
    public Map<String, String> index(){
        return Collections.singletonMap("Message", "index message");
    }

}
