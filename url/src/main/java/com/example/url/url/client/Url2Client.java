package com.example.url.url.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "url2-service")
public interface Url2Client {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/hello")
    String helloFrom2();


}
