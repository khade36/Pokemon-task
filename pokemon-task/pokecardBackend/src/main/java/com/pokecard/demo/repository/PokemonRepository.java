package com.pokecard.demo.repository;

import com.pokecard.demo.dao.Pocards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pocards,Integer> {
}
