package com.example.simpleboot.Controller;

import com.example.simpleboot.Model.Coordinates;
import com.example.simpleboot.Model.Map;
import com.example.simpleboot.Service.CoordinatesService;
import com.example.simpleboot.Service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CoordinatesController {
    private final CoordinatesService coordinatesService;
    private final MapService mapService;

    @Autowired
    public CoordinatesController(CoordinatesService coordinatesService, MapService mapService) {
        this.coordinatesService = coordinatesService;
        this.mapService = mapService;
    }

    @RequestMapping("/map")
    public String findAll(Model model){
        List<Coordinates> coordinates =  coordinatesService.findAll();
        model.addAttribute("coordinates", coordinates);
        List<Map> mapList = mapService.mapList();
        model.addAttribute("map", mapList);
        return "Coordinates";
    }

    @RequestMapping("/map/{cartSerial}")
    public String findCoordinates(@PathVariable("cartSerial") int cartSerial, Model model){
            List<Coordinates> mapCoordinates = coordinatesService.findBySerialCoordinates(cartSerial);
            model.addAttribute("coordinate", mapCoordinates);
            return "road-page";
    }


    @GetMapping("/calculate-page")
    public String createBotForm(Coordinates coordinates){
        return "calculate-page";
    }

    @PostMapping("/calculate-route")
    public String createBot(Coordinates coordinates, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "bot-list";
        coordinatesService.calculateRoute(coordinates);
        return "redirect:/bots";
    }

    @PostMapping("/send-data")
    public String sendDataToBot(){

        return "redirect:/map";
    }

}
