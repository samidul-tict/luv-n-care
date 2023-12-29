package com.learning.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.learning.academy.repository.StuffRepository;
import com.learning.academy.model.Stuff;

import java.util.List;

@RestController
@RequestMapping("/api/stuff")
public class StuffController {

    @Autowired
    StuffRepository stuffRepository;

    @PostMapping
    public String create(@RequestBody Stuff stuff) {

        stuffRepository.save(stuff);
        return "Stuff is created";
    }

    @GetMapping
    public List<Stuff> getAllStudents() {

        List<Stuff> stuffs = stuffRepository.findAll();
        return stuffs;
    }
}
