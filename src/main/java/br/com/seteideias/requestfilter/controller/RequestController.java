package br.com.seteideias.requestfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/teste")
    public String execute(){
        return "okk";
    }

}
