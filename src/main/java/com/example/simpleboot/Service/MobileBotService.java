package com.example.simpleboot.Service;

import com.example.simpleboot.Model.MobileBot;
import com.example.simpleboot.Repo.MobileBotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileBotService {

    private final MobileBotRepository mobileBotRepository;

    @Autowired
    public MobileBotService(MobileBotRepository mobileBotRepository) {
        this.mobileBotRepository = mobileBotRepository;
    }

    public MobileBot findBySerial(int cartSerial){
        return mobileBotRepository.findAllByCartSerial(cartSerial);
    }

    public void saveBot(MobileBot mobileBot){
        mobileBotRepository.save(mobileBot);
    }

    public List<MobileBot> findAll(){
        return mobileBotRepository.findAll();
    }

    public void deleteBot(int cartSerial){
        this.mobileBotRepository.deleteByCartSerial(cartSerial);
    }




}
