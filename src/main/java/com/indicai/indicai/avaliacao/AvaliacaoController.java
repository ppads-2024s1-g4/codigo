package com.indicai.indicai.avaliacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/api")
public class AvaliacaoController {

  @Autowired
  private AvaliacaoRepository repository;



  public AvaliacaoController(){}


  @GetMapping("/avaliacoes")
  public List<Avaliacao> getAvaliacoes() {
      return repository.findAll();
  }

  @GetMapping("/avaliacoes/{id}")
  public Optional<Avaliacao> getAvaliacao(@PathVariable long id) {
      Optional<Avaliacao> opt = repository.findById(id);
      
      if(opt.isPresent()){
          return opt;
      } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao buscar avaliacao com id " + id);
  } 

  @PostMapping("/avaliacoes")
  public Avaliacao postavaliacao(@RequestBody Avaliacao avaliacao) {
      return repository.save(avaliacao);
  }

  @PutMapping("/avaliacoes/{avaliacaoId}")
  public Optional<Avaliacao> updateAvaliacao(@RequestBody Avaliacao avaliacao, @PathVariable(value= "avaliacaoId") long avaliacaoId){
    Optional<Avaliacao> opt = this.getAvaliacao(avaliacaoId);
    if (opt.isPresent() && opt.get().getId() == avaliacao.getId()){
      return Optional.of(repository.save(avaliacao));
    } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do avaliacao com id" + avaliacaoId);
  }

    
  @DeleteMapping(value = "/avaliacoes/{id}")
  public void deleteAvaliacao(@PathVariable long id){
    if(repository.findById(id) == null){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "O servidor não encontrou nada que corresponda ao request.");
    }
    repository.deleteById(id);
  }
}