package prova.valendo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prova.valendo.crud.model.Usuario;
import prova.valendo.crud.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }
    
    @PutMapping
    public Usuario alterar(@RequestBody Usuario usuario){
        if(usuario.getId()>0)
        return repository.save(usuario);
        return null;
    }
    
    @DeleteMapping
    public String deletar(@RequestBody Usuario usuario){
        if(usuario.getId()>0){
        repository.delete(usuario);
        return "Removido com sucesso";
    }
    return "usuario nao encontrado";
    }
}