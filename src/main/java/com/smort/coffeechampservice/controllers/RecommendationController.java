package com.smort.coffeechampservice.controllers;

import com.smort.coffeechampservice.models.Preference;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RecommendationController {

    @CrossOrigin
    @PostMapping("/recommendation")
    public String getRecommendation(@RequestBody Preference body){
        ArrayList preferences = body.getPreferences();
        String recommendation;

        if(preferences.contains("dark")){
            recommendation = "Peru";
        }
        else if(preferences.contains("sweet")){
            recommendation = "Ethiopia";
        }
        else if(preferences.contains("chocolate")){
            recommendation = "Chile";
        }
        else if(preferences.contains("earthy")){
            recommendation = "Panama";
        }
        else{
            recommendation = "Guatemala";
        }
        return recommendation;
    }
}
