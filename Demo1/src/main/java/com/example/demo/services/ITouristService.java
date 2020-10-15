package com.example.demo.services;

import com.example.demo.pojo.users.Tourist;
import com.example.demo.response.ResponseResult;

import javax.servlet.http.HttpServletRequest;

public interface ITouristService {
    ResponseResult initManagerAccount(Tourist tourist, HttpServletRequest request);
}
