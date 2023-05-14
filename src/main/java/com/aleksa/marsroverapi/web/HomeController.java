package com.aleksa.marsroverapi.web;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aleksa.marsroverapi.dto.HomeDto;
import com.aleksa.marsroverapi.response.MarsRoverApiResponse;
import com.aleksa.marsroverapi.service.MarsRoverApiService;




@Controller
public class HomeController {

    @Autowired
    private MarsRoverApiService roverService;
    
    @GetMapping("/")
    public String getHome(ModelMap model,Long userId, Boolean createUser) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        HomeDto homeDto = createDefaulHomeDto(userId);
        
        if(Boolean.TRUE.equals(createUser) && userId == null){
            homeDto = roverService.save(homeDto);
        } else {
            homeDto = roverService.findByUserId(userId);
            if(homeDto == null){
                homeDto = createDefaulHomeDto(userId);
            }
        }
       
        MarsRoverApiResponse roverData = roverService.getRoverData(homeDto);
        model.put("roverData", roverData);
        model.put("homeDto", homeDto);
        model.put("validCameras", roverService.getValidCameras().get(homeDto.getMarsApiRoverData()));
        if(Boolean.TRUE.equals(homeDto.getRememberPreferences()) && userId != null){
            HomeDto defaultHomeDto = createDefaulHomeDto(userId);
            roverService.save(defaultHomeDto);
        }
        return "index";
    }


    @GetMapping("/savePreferences")
    @ResponseBody
    public HomeDto getSavedPreferences(Long userId){
        if(userId != null){
            return roverService.findByUserId(userId);
        } else{
            return createDefaulHomeDto(userId);
        }
    }

    private HomeDto createDefaulHomeDto(Long userId){
        HomeDto homeDto = new HomeDto();
        homeDto.setMarsApiRoverData("Opportunity");
        homeDto.setMarsSol(1);
        homeDto.setUserId(userId);
        return homeDto;
    }

    @PostMapping("/")
    public String postHomeView(HomeDto homeDto) {
        homeDto = roverService.save(homeDto);
        return "redirect:/?userId=" + homeDto.getUserId();
    }

 
}
