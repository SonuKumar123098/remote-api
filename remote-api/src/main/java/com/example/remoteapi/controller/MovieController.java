package com.example.remoteapi.controller;

import com.example.remoteapi.dto.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Qualifier("getRestTemplate")
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get-info/{id}")
//    @PathVariable("id") String movieId
    public Object getMovie(@PathVariable("id") String movieId){
//        String url2="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";
        String url1="https://api.themoviedb.org/3/movie/"+movieId+"?api_key=091bc2e9f9b015059c33a5d752f01b90";
//        url2+=movieId;
        Object response=restTemplate.getForObject(url1,Object.class);
        return response;
    }

    @GetMapping("/get-customized-info/{id}")
    public MovieResponse getCustomizedMovie(@PathVariable("id") String movieId){
        String url="you will get url from remote api along with unique key of api";
        String url1="https://api.themoviedb.org/3/movie/"+movieId+"?api_key=091bc2e9f9b015059c33a5d752f01b90";
        MovieResponse response=restTemplate.getForObject(url1,MovieResponse.class);
        return response;
    }
//    //calling local api
//    @GetMapping("/get-student")
//    public Object getStudent(@RequestParam("id") int regNo){
//        String url="http//localhost/999/student/get/q="+regNo;
//        Object response=restTemplate.getForObject(url,Object.class);
//        return response;
//    }
}
