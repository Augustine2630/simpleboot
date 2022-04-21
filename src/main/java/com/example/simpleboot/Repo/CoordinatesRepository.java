package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoordinatesRepository extends JpaRepository<Coordinates, Integer> {

    List<Coordinates> findAllByCartSerial(int cartSerial);
}
