package br.com.fecaf.Semestral.controler;


import br.com.fecaf.Semestral.model.Endereco;
import br.com.fecaf.Semestral.repository.EnderecoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastrarenderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    public ResponseEntity<Endereco> criar(@Valid @RequestBody Endereco endereco){
        //Se os campos nao estiverem prenchidos o spring retorna ero 400
        return ResponseEntity.ok(enderecoRepository.save(endereco));
    }
}
