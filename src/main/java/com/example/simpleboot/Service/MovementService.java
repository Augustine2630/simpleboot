package com.example.simpleboot.Service;

import com.example.simpleboot.Model.Movement;
import com.example.simpleboot.Repo.MovementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementService {
    private final MovementRepository movementRepository;

    @Autowired
    public MovementService(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public List<Movement> movementList(){
        return movementRepository.findAll();
    }
}
