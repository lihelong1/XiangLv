package com.example.demo.controller.User;

import com.example.demo.pojo.users.Tourist;
import com.example.demo.response.ResponseResult;
import com.example.demo.services.ITouristService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Tourist")
public class TouristApi {


    private ITouristService touristService;

    @PostMapping("/admin_account")
    public ResponseResult initManagerAccount(@RequestBody Tourist Tourist, HttpServletRequest request){

        return touristService.initManagerAccount(Tourist,request);


    }
}
