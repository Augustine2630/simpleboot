///spring mvc конроллер для создания карты
package com.example.simpleboot.Controller;

import com.example.simpleboot.Model.Metadata;
import com.example.simpleboot.Service.MetadataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Controller
public class MapController {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    private final MetadataService metadataService;

    public MapController(MetadataService metadataService) {
        this.metadataService = metadataService;
    }

    @GetMapping("/map/1:1")
    public String oneone(){
        return "map/one/one-one";
    }

    @GetMapping("/map/1:2")
    public String onetwo(){
        return "map/one/one-two";
    }

    @GetMapping("/map/1:3")
    public String onethree(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-three";
    }

    @GetMapping("/map/1:4")
    public String onefour(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-four";
    }

    @GetMapping("/map/1:5")
    public String onefive(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-five";
    }

    @GetMapping("/map/1:6")
    public String onesix(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-six";
    }

    @GetMapping("/map/1:7")
    public String oneseven(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-seven";
    }

    @GetMapping("/map/1:8")
    public String oneeight(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-eight";
    }

    @GetMapping("/map/1:9")
    public String onenine(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-nine";
    }

    @GetMapping("/map/1:10")
    public String oneten(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/one/one-ten";
    }

    @GetMapping("/map/2:1")
    public String twoone(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-one";
    }

    @GetMapping("/map/2:2")
    public String twotwo(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-two";
    }

    @GetMapping("/map/2:3")
    public String twothree(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-three";
    }

    @GetMapping("/map/2:4")
    public String twofour(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-four";
    }

    @GetMapping("/map/2:5")
    public String twofive(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-five";
    }

    @GetMapping("/map/2:6")
    public String twosix(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-six";
    }

    @GetMapping("/map/2:7")
    public String twoseven(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-seven";
    }

    @GetMapping("/map/2:8")
    public String twoeight(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-eight";
    }

    @GetMapping("/map/2:9")
    public String twonine(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-nine";
    }

    @GetMapping("/map/2:10")
    public String twoten(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/two/two-ten";
    }

    @GetMapping("/map/3:1")
    public String threeone(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-one";
    }

    @GetMapping("/map/3:2")
    public String threetwo(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-two";
    }

    @GetMapping("/map/3:3")
    public String threethree(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-three";
    }

    @GetMapping("/map/3:4")
    public String threefour(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-four";
    }

    @GetMapping("/map/3:5")
    public String threefive(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-five";
    }

    @GetMapping("/map/3:6")
    public String threesix(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-six";
    }

    @GetMapping("/map/3:7")
    public String threeseven(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-seven";
    }

    @GetMapping("/map/3:8")
    public String threeeight(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-eight";
    }

    @GetMapping("/map/3:9")
    public String threenine(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-nine";
    }

    @GetMapping("/map/3:10")
    public String threeten(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/three/three-ten";
    }

    @GetMapping("/map/4:1")
    public String fourone(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-one";
    }

    @GetMapping("/map/4:2")
    public String fourtwo(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-two";
    }

    @GetMapping("/map/4:3")
    public String fourthree(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-three";
    }

    @GetMapping("/map/4:4")
    public String fourfour(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-four";
    }

    @GetMapping("/map/4:5")
    public String fourfive(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-five";
    }

    @GetMapping("/map/4:6")
    public String foursix(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-six";
    }

    @GetMapping("/map/4:7")
    public String fourseven(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-seven";
    }

    @GetMapping("/map/4:8")
    public String foureight(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-eight";
    }

    @GetMapping("/map/4:9")
    public String fournine(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-nine";
    }

    @GetMapping("/map/4:10")
    public String fourten(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/four/four-ten";
    }
    @GetMapping("/map/5:1")
    public String fiveone(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-one";
    }

    @GetMapping("/map/5:2")
    public String fivetwo(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-two";
    }

    @GetMapping("/map/5:3")
    public String fivethree(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-three";
    }

    @GetMapping("/map/5:4")
    public String fivefour(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-four";
    }

    @GetMapping("/map/5:5")
    public String fivefive(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-five";
    }

    @GetMapping("/map/5:6")
    public String fivesix(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-six";
    }

    @GetMapping("/map/5:7")
    public String fiveseven(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-seven";
    }

    @GetMapping("/map/5:8")
    public String fiveeight(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-eight";
    }

    @GetMapping("/map/5:9")
    public String fivenine(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-nine";
    }

    @GetMapping("/map/5:10")
    public String fiveten(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/five/five-ten";
    }

    @GetMapping("/map/6:1")
    public String sixone(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-one";
    }

    @GetMapping("/map/6:2")
    public String sixtwo(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-two";
    }

    @GetMapping("/map/6:3")
    public String sixthree(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-three";
    }

    @GetMapping("/map/6:4")
    public String sixfour(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-four";
    }

    @GetMapping("/map/6:5")
    public String sixfive(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-five";
    }

    @GetMapping("/map/6:6")
    public String sixsix(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-six";
    }

    @GetMapping("/map/6:7")
    public String sixseven(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-seven";
    }

    @GetMapping("/map/6:8")
    public String sixeight(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-eight";
    }

    @GetMapping("/map/6:9")
    public String sixnine(Model model){
        System.out.println("System: метаданные обработаны");
        System.out.println("System: команда отправлена ");
        System.out.println("System: команда обработана");

        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-nine";
    }

    @GetMapping("/map/6:10")
    public String sixten(Model model){
        List<Metadata> metadataList = metadataService.metadataList();
        model.addAttribute("metadata", metadataList);
        return "map/six/six-ten";
    }



}
