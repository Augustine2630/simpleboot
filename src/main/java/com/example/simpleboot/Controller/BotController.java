package com.example.simpleboot.Controller;

import com.example.simpleboot.Model.Coordinates;
import com.example.simpleboot.Model.Map;
import com.example.simpleboot.Model.MobileBot;
import com.example.simpleboot.Service.MapService;
import com.example.simpleboot.Service.MobileBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@Controller
public class BotController {

    private final MobileBotService mobileBotService;
    private final MapService mapService;

    @Autowired
    public BotController(MobileBotService mobileBotService, MapService mapService) {
        this.mobileBotService = mobileBotService;
        this.mapService = mapService;
    }

    @GetMapping(value = {"/", "/bots"})
    public String findAll(Model model, Coordinates coordinates){
        List<MobileBot> bots = mobileBotService.findAll();
        model.addAttribute("bots", bots);
        model.addAttribute("coord", coordinates);
        return "bot-list";
    }

    @RequestMapping("/bots/{cartSerial}")
    public String findBySerial(@PathVariable("cartSerial") int cartSerial, Model model){
        model.addAttribute("serial", mobileBotService.findBySerial(cartSerial));
        List<Map> mapList = mapService.mapList();
        model.addAttribute("map", mapList);
        return "Coordinates";
    }

    @GetMapping("/bot-create")
    public String createBotForm(MobileBot mobileBot){
        return "save-page";
    }

    @PostMapping("/bot-create")
    public String createBot(@Valid MobileBot mobileBot, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "bot-list";
        mobileBotService.saveBot(mobileBot);
        return "redirect:/bots";
    }

    @GetMapping("/deleteBot/{cartSerial}")
    public String deleteBot(@PathVariable(value = "cartSerial") int cartSerial){
        mobileBotService.deleteBot(cartSerial);
        return "redirect:/bots";
    }

    @GetMapping("/showFormForUpdate/{cartSerial}")
    public String updateBot(@PathVariable("cartSerial") int cartSerial, Model model){
        MobileBot mobileBot = mobileBotService.findBySerial(cartSerial);

        model.addAttribute("bot", mobileBot);
        return "update-bot";
    }


}
