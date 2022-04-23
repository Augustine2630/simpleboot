package com.example.simpleboot.Controller;

import com.example.simpleboot.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RoadController {


    private final ImageService imageService;

    @Autowired
    public RoadController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/road")
    public String calculateTheRoad(Model model){
        imageService.startGenerator();
        model.addAttribute("road");
        return "redirect:/map";
    }
}
