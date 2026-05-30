package br.com.fecaf.Semestral.repository;

import br.com.fecaf.Semestral.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
