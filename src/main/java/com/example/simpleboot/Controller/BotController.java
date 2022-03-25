package com.example.simpleboot.Controller;

import com.example.simpleboot.Model.MobileBot;
import com.example.simpleboot.Service.MobileBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BotController {

    private final MobileBotService mobileBotService;

    @Autowired
    public BotController(MobileBotService mobileBotService) {
        this.mobileBotService = mobileBotService;
    }

    @GetMapping("/bots")
    public String findAll(Model model){
        List<MobileBot> bots = mobileBotService.findAll();
        model.addAttribute("bots", bots);
        return "bot-list";
    }
}
