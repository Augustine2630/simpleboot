//spring класс позволяющий работать с моделью-сущностью bots
package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.MobileBot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MobileBotRepository extends JpaRepository<MobileBot, Integer> {
    //показ всех данных по серийному ключу
    MobileBot findAllByCartSerial(int cartSerial);
    //транзакционное удаление по серийному ключу
    @Transactional
    void deleteByCartSerial(int cartSerial);


}
