package com.indicai.indicai.usuario;

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
public class UsuarioController {

  @Autowired
  private UsuarioRepository repository;

  public UsuarioController(){}

  @GetMapping("/usuarios")
  public List<Usuario> getUsuarios() {
      return repository.findAll();
  }

  @GetMapping("/usuarios/{id}")
  public Optional<Usuario> getUsuario(@PathVariable long id) {
      Optional<Usuario> opt = repository.findById(id);
      
      if(opt.isPresent()){
          return opt;
      } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao buscar usuario com id " + id);
  } 

  @PostMapping("/usuarios")
  public Usuario postUsuario(@RequestBody Usuario usuario) {
      return repository.save(usuario);
  }

  @PutMapping("/usuarios/{usuarioId}")
  public Optional<Usuario> updateUsuario(@RequestBody Usuario usuario, @PathVariable(value= "usuarioId") long usuarioId){
    Optional<Usuario> opt = this.getUsuario(usuarioId);
    if (opt.isPresent() && opt.get().getId() == usuario.getId()){
      return Optional.of(repository.save(usuario));
    } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do usuario com id" + usuarioId);
  }

    
  @DeleteMapping(value = "/usuarios/{id}")
  public void deleteUsuario(@PathVariable long id){
    if(repository.findById(id) == null){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "O servidor não encontrou nada que corresponda ao request.");
    }
    repository.deleteById(id);
  }
}