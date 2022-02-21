package com.example.url.url.controller;


import com.example.url.url.client.Url2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador principal para los servicios de alcaldias
 *
 * @author Jose Torrealba
 *
 */
@RestController
@RequestMapping(value = {"/api/v1/hello1"}, produces = {"application/json"})
public class HelloControllerImpl {

    private final Url2Client client;

    @Autowired
    public HelloControllerImpl(Url2Client client) {
        this.client = client;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = {RequestMethod.GET}, produces = {"application/json"})
    public String hello() {
        System.out.println(client.helloFrom2());
        return "hello from 1";
    }
}
