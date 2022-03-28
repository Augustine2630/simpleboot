package com.example.simpleboot.Controller;

import com.example.simpleboot.Model.Coordinates;
import com.example.simpleboot.Service.CoordinatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CoordinatesController {
    private final CoordinatesService coordinatesService;

    @Autowired
    public CoordinatesController(CoordinatesService coordinatesService) {
        this.coordinatesService = coordinatesService;
    }

    @RequestMapping("/map")
    public String findAll(Model model){
        List<Coordinates> coordinates =  coordinatesService.findAll();
        model.addAttribute("coordinates", coordinates);
        return "Coordinates";
    }


}
