package com.indicai.indicai.itens.controller;

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

import com.indicai.indicai.itens.entity.Livro;
import com.indicai.indicai.itens.repository.LivroRepository;

@RestController
@RequestMapping(value = "/api")
public class LivroController {

  @Autowired
  private LivroRepository repository;

  public LivroController(){}

  @GetMapping("/livros")
  public List<Livro> getLivros() {
      return repository.findAll();
  }

  @GetMapping("/livros/{id}")
  public Optional<Livro> getLivro(@PathVariable long id) {
      Optional<Livro> opt = repository.findById(id);
      
      if(opt.isPresent()){
          return opt;
      } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao buscar livro com id " + id);
  } 

  @PostMapping("/livros")
  public Livro postLivro(@RequestBody Livro livro) {
      return repository.save(livro);
  }

  @PutMapping("/livros/{livroId}")
  public Optional<Livro> updateLivro(@RequestBody Livro livro, @PathVariable(value= "livroId") long livroId){
    Optional<Livro> opt = this.getLivro(livroId);
    if (opt.isPresent() && opt.get().getId() == livro.getId()){
      return Optional.of(repository.save(livro));
    } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do livro com id" + livroId);
  }

    
  @DeleteMapping(value = "/livros/{id}")
  public void deleteLivro(@PathVariable long id){
    if(repository.findById(id) == null){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "O servidor não encontrou nada que corresponda ao request.");
    }
    repository.deleteById(id);
  }
}
