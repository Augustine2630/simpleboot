//spring класс позволяющий работать с моделью-сущностью traj
package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoordinatesRepository extends JpaRepository<Coordinates, Integer> {

    //показ в представлении всех данных по серийному ключу
    List<Coordinates> findAllByCartSerial(int cartSerial);
}
