//spring класс serviсe необходимый для управления данными
package com.example.simpleboot.Service;

import com.example.simpleboot.Model.Metadata;
import com.example.simpleboot.Repo.MetadataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadataService {

    private final MetadataRepository metadataRepository;

    public MetadataService(MetadataRepository metadataRepository) {
        this.metadataRepository = metadataRepository;
    }

    public void generateCode(int data){
        
    }

    public List<Metadata> metadataList(){
        return metadataRepository.findAll();
    }


}
