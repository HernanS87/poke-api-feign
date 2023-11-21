package com.todocode.pokeApiFeing.repository;

import com.todocode.pokeApiFeing.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="pokeapi", url="https://pokeapi.co/api/v2")
public interface PokeAPIClient {
   
   @GetMapping("/pokemon/{id}")
   public PokemonDTO getPokemonByID(@PathVariable int id);
   
}
