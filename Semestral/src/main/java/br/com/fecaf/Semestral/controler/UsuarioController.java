package br.com.fecaf.Semestral.controler;

import br.com.fecaf.Semestral.model.Usuario;
import br.com.fecaf.Semestral.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario) {
        // Se os campos não estiverem preenchidos, o Spring retorna erro 400 automaticamente
        return ResponseEntity.ok(usuarioRepository.save(usuario));
    }

}
