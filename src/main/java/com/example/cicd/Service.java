package com.example.cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final EntityRepository entityRepository;
    @Transactional
    public void createEntity(String args) {
        Entity entity = new Entity();
        entity.setOne(args + ", " + LocalDateTime.now().toString());
        entityRepository.save(entity);
    }

    public List<Entity> findAll() {
        return entityRepository.findAll();
    }
}
