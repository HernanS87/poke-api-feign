package com.todocode.pokeApiFeing.controller;

import com.todocode.pokeApiFeing.dto.PokemonDTO;
import com.todocode.pokeApiFeing.repository.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
   
   @Autowired
   PokeAPIClient pokeAPI;
   
   @GetMapping("pokemon/{id}")
   public PokemonDTO getPokemonByID(@PathVariable int id){
      return pokeAPI.getPokemonByID(id);
   }
   
}
