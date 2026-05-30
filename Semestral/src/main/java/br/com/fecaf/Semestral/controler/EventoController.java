package br.com.fecaf.Semestral.controler;

import br.com.fecaf.Semestral.model.Evento;
import br.com.fecaf.Semestral.repository.EventoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastrarevento")

public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping
    public ResponseEntity<Evento> cirar(@Valid @RequestBody Evento evento){
        //Se nao estiver prenchido os campos o spring retorna erro 400
        return ResponseEntity.ok(eventoRepository.save(evento));
    }


}
