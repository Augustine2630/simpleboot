//spring класс позволяющий работать с моделью-сущностью map
package com.example.simpleboot.Repo;

import com.example.simpleboot.Model.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapRepository extends JpaRepository<Map, Integer> {

}
