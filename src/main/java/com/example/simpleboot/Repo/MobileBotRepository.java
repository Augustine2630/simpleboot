package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.MobileBot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileBotRepository extends JpaRepository<MobileBot, Integer> {
}
