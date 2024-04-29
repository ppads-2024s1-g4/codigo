package com.indicai.indicai.itens.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.indicai.indicai.itens.entity.Serie;
import com.indicai.indicai.itens.repository.SerieRepository;

@RestController
@RequestMapping(value = "/api")
public class SerieController {

  @Autowired
  private SerieRepository repository;

  public SerieController(){}

  @GetMapping("/series")
  public List<Serie> getSeries() {
      return repository.findAll();
  }

  @GetMapping("/series/{id}")
  public Optional<Serie> getSerie(@PathVariable long id) {
      Optional<Serie> opt = repository.findById(id);
      
      if(opt.isPresent()){
          return opt;
      } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao buscar serie com id " + id);
  } 

  @PostMapping("/series")
  //@PreAuthorize("hasRole('ADMIN')")
  public Serie postSerie(@RequestBody Serie serie) {
      return repository.save(serie);
  }

  @PutMapping("/series/{serieId}")
  //@PreAuthorize("hasRole('ADMIN')")
  public Optional<Serie> updateSerie(@RequestBody Serie serie, @PathVariable(value= "serieId") long serieId){
    Optional<Serie> opt = this.getSerie(serieId);
    if (opt.isPresent() && opt.get().getId() == serie.getId()){
      return Optional.of(repository.save(serie));
    } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados da serie com id" + serieId);
  }

    
  @DeleteMapping(value = "/series/{id}")
  //@PreAuthorize("hasRole('ADMIN')")
  public void deleteSerie(@PathVariable long id){
    if(repository.findById(id) == null){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "O servidor não encontrou nada que corresponda ao request.");
    }
    repository.deleteById(id);
  }
}