package com.example.remoteapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get-info/{id}")
    public Object getMovie(@PathVariable("id") String movieId){
        String url="you will get url from remote api along with unique key of api";
        Object response=restTemplate.getForObject(url,Object.class);
        return response;
    }

    @GetMapping("/get-customized-info/{id}")
    public MovieResponse getCustomizedMovie(@PathVariable("id") String movieId){
        String url="you will get url from remote api along with unique key of api";
        MovieResponse response=restTemplate.getForObject(url,MovieResponse.class);
        return response;
    }
}
