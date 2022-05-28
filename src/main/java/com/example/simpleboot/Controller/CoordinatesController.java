package com.example.simpleboot.Controller;

import com.example.simpleboot.Model.Coordinates;
import com.example.simpleboot.Model.MobileBot;
import com.example.simpleboot.Service.CoordinatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
