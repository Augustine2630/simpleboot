package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.MobileBot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MobileBotRepository extends JpaRepository<MobileBot, Integer> {
    MobileBot findAllByCartSerial(int cartSerial);
    @Transactional
    void deleteByCartSerial(int cartSerial);


    MobileBot updateSerial();

}
