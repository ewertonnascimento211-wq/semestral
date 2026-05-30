package br.com.fecaf.Semestral.controler;

import br.com.fecaf.Semestral.model.Evento;
import br.com.fecaf.Semestral.repository.EventoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping

    public List<Evento> findAll(){
        System.out.println(eventoRepository.findAll().size());
        return eventoRepository.findAll();
    }


}
