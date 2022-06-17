//spring класс serviсe необходимый для управления данными
package com.example.simpleboot.Service;

import com.example.simpleboot.Model.Map;
import com.example.simpleboot.Repo.MapRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {

    private final MapRepository mapRepository;

    public MapService(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }



    public List<Map> mapList(){
        return mapRepository.findAll();
    }

}
