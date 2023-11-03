package prova.valendo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prova.valendo.crud.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
