//spring класс serviсe необходимый для управления данными
package com.example.simpleboot.Service;

import com.example.simpleboot.Model.Coordinates;
import com.example.simpleboot.Repo.CoordinatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordinatesService {

    private final CoordinatesRepository coordinatesRepository;

    @Autowired
    public CoordinatesService(CoordinatesRepository coordinatesRepository) {
        this.coordinatesRepository = coordinatesRepository;
    }

    public List<Coordinates> findAll(){
        return coordinatesRepository.findAll();
    }

    public List<Coordinates> findBySerialCoordinates(int cartSerial){
        return coordinatesRepository.findAllByCartSerial(cartSerial);
    }

    public Coordinates calculateRoute(Coordinates coordinates){
        return coordinatesRepository.save(coordinates);
    }

}
