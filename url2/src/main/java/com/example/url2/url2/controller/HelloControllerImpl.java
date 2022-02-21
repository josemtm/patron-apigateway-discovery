package com.example.url2.url2.controller;


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
@RequestMapping(value = {"/api/v1/hello"}, produces = {"application/json"})
public class HelloControllerImpl {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = {RequestMethod.GET}, produces = {"application/json"})
    public String hello() {

        return "hello from 2";
    }
}
