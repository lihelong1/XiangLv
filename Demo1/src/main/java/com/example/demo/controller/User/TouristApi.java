package com.example.demo.controller.User;

import com.example.demo.pojo.Tourist;
import com.example.demo.response.ResponseResult;
import com.example.demo.services.ITouristService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tourist")
public class TouristApi {


    private ITouristService touristService;

    @PostMapping("/admin_account")
    public ResponseResult initManagerAccount(@RequestBody Tourist Tourist, HttpServletRequest request){
        return touristService.initManagerAccount(Tourist,request);
    }


    @GetMapping("/w")
    public String he(){
        return "s";
    }

}
