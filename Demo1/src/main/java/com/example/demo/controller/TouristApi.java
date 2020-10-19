package com.example.demo.controller;

import com.example.demo.pojo.Tourist;
import com.example.demo.response.ResponseResult;
import com.example.demo.services.ITouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tourist")
public class TouristApi {


    @Autowired
    private ITouristService touristService;

    @PostMapping("/account")
    public ResponseResult initManagerAccount(@RequestBody Tourist Tourist, HttpServletRequest request){
        return touristService.initManagerAccount(Tourist,request);
    }



    @GetMapping("/gghfhgffggjh")
    public String he(){
        return "ghjhjggjhjgh";
    }

}

