package com.pokecard.demo.service;

import com.pokecard.demo.dao.Pocards;
import com.pokecard.demo.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PoServiceIMPL {
    @Autowired
    PokemonRepository repository;

    public Pocards save(Pocards pocards) {
            return repository.save(pocards);
        }
    }
