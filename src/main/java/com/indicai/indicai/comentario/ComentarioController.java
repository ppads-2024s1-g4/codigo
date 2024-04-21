package com.indicai.indicai.comentario;

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
public class ComentarioController {

  @Autowired
  private ComentarioRepository repository;

  public ComentarioController(){}

  @GetMapping("/comentarios")
  public List<Comentario> getComentarios() {
      return repository.findAll();
  }

  @GetMapping("/comentarios/{id}")
  public Optional<Comentario> getComentario(@PathVariable long id) {
      Optional<Comentario> opt = repository.findById(id);
      
      if(opt.isPresent()){
          return opt;
      } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao buscar comentario com id " + id);
  } 

  @PostMapping("/comentarios")
  public Comentario postcomentario(@RequestBody Comentario comentario) {
      return repository.save(comentario);
  }

  @PutMapping("/comentarios/{comentarioId}")
  public Optional<Comentario> updateComentario(@RequestBody Comentario comentario, @PathVariable(value= "comentarioId") long comentarioId){
    Optional<Comentario> opt = this.getComentario(comentarioId);
    if (opt.isPresent() && opt.get().getId() == comentario.getId()){
      return Optional.of(repository.save(comentario));
    } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do comentario com id" + comentarioId);
  }

    
  @DeleteMapping(value = "/comentarios/{id}")
  public void deleteComentario(@PathVariable long id){
    if(repository.findById(id) == null){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "O servidor não encontrou nada que corresponda ao request.");
    }
    repository.deleteById(id);
  }
}