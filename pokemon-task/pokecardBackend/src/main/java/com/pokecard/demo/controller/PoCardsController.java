package com.pokecard.demo.controller;

import com.pokecard.demo.dao.Pocards;
import com.pokecard.demo.service.PoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PoCardsController {
    @Autowired
    PoServiceIMPL service;

    @PostMapping("/save")
    public ResponseEntity<?> savePokemon(@RequestBody  Pocards pocards) {
        return new ResponseEntity<>(service.save(pocards), HttpStatus.OK);
    }
}
