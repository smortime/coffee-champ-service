package com.smort.coffeechampservice.recommendation;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class RecommendationController {
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name;
    }

    @PostMapping("/recommendation")
    public String getRecommendation(@RequestBody Map<String, ArrayList> body){
        ArrayList preferences = body.get("preferences");
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
