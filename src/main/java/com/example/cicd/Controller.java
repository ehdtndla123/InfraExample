package com.example.cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final Service service;

    @GetMapping("/one")
    public ResponseEntity<String> getOne() {

        service.createEntity("one");
        return ResponseEntity.ok("one");
    }

    @GetMapping("/two")
    public ResponseEntity<String> getTwo() {
        service.createEntity("two");
        return ResponseEntity.ok("two");
    }

    @GetMapping("/find")
    public ResponseEntity<List<Entity>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
