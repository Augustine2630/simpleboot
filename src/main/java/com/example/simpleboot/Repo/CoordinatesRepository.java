package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoordinatesRepository extends JpaRepository<Coordinates, Integer> {
    @Query(value = "SELECT start_x, start_y FROM traj WHERE cart_serial=?1", nativeQuery = true)
    List<Coordinates> findAllByCartSerial(int cartSerial);
}
