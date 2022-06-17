//spring класс serviсe необходимый для управления данными
package com.example.simpleboot.Service;

import com.example.simpleboot.Repo.MetadataRepository;
import org.springframework.stereotype.Service;

@Service
public class MetadataService {

    private final MetadataRepository metadataRepository;

    public MetadataService(MetadataRepository metadataRepository) {
        this.metadataRepository = metadataRepository;
    }


}
