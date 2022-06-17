///spring mvc конроллер для создания карты
package com.example.simpleboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping("/map/1:1")
    public String oneone(){
        return "map/one-one";
    }

    @GetMapping("/map/1:2")
    public String onetwo(){
        System.out.println("System: метаданные обработаны");
        return "map/one-two";
    }

    @GetMapping("/map/1:3")
    public String onethree(){
        return "map/one-three";
    }

    @GetMapping("/map/1:4")
    public String onefour(){
        return "map/one-four";
    }

    @GetMapping("/map/1:5")
    public String onefive(){
        return "map/one-five";
    }



}
