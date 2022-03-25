package com.example.simpleboot.Controller;


import com.example.simpleboot.Model.Movement;
import com.example.simpleboot.Service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StartController {

    private final MovementService movementService;

    public StartController(MovementService movementService) {
        this.movementService = movementService;
    }

    @RequestMapping("/start")
    public String findStartCoord(Model model){
        List<Movement> start = movementService.movementList();
        model.addAttribute("start", start);
        return "start-page";
    }



}
