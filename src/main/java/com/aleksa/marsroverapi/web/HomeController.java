package com.aleksa.marsroverapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aleksa.marsroverapi.response.MarsRoverApiResponse;
import com.aleksa.marsroverapi.service.MarsRoverApiService;

import io.micrometer.common.util.StringUtils;



@Controller
public class HomeController {

    @Autowired
    private MarsRoverApiService roverService;
    
    @GetMapping("/")
    public String getHome(ModelMap model, @RequestParam(required = false) String marsApiRoverData){
        if(StringUtils.isEmpty(marsApiRoverData)){
            marsApiRoverData = "opportunity";
        }
        MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);
        model.put("roverData", roverData);
        return "index";
    }

 
}
