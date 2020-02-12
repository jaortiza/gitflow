package com.proyectoDocker.client.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @RequestMapping(value = "/getclient", method = RequestMethod.GET)
    public String getClient() {
        return "Hola desde el modulo cliente";
    }


}
