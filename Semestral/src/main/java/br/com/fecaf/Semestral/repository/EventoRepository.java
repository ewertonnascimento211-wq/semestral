package br.com.fecaf.Semestral.repository;

import br.com.fecaf.Semestral.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento,Long> {
}
