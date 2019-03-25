package com.example.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/v1/pessoa")
@CrossOrigin({"*"})
public class PessoaController {

    @GetMapping
    public String select() throws Exception {
        return "Keillani programadora!";
    }
}
