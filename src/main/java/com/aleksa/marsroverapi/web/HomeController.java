package com.aleksa.marsroverapi.web;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aleksa.marsroverapi.dto.HomeDto;
import com.aleksa.marsroverapi.response.MarsRoverApiResponse;
import com.aleksa.marsroverapi.service.MarsRoverApiService;

import io.micrometer.common.util.StringUtils;



@Controller
public class HomeController {

    @Autowired
    private MarsRoverApiService roverService;
    
    @GetMapping("/")
    public String getHome(ModelMap model,HomeDto homeDto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        if(StringUtils.isEmpty(homeDto.getMarsApiRoverData())){
            homeDto.setMarsApiRoverData("Opportunity");
        }
        if(homeDto.getMarsSol() == null){
            homeDto.setMarsSol(1);
        }
        MarsRoverApiResponse roverData = roverService.getRoverData(homeDto);
        model.put("roverData", roverData);
        model.put("homeDto", homeDto);
        model.put("validCameras", roverService.getValidCameras().get(homeDto.getMarsApiRoverData()));
        return "index";
    }

    @PostMapping("/")
    public String postHomeView(HomeDto homeDto) {
        System.out.println(homeDto);
        return "redirect:/";
    }

 
}
