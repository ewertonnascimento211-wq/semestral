package br.com.fecaf.Semestral.controler;

import br.com.fecaf.Semestral.model.Usuario;
import br.com.fecaf.Semestral.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario) {
        // Se os campos não estiverem preenchidos, o Spring retorna erro 400 automaticamente
        return ResponseEntity.ok(usuarioRepository.save(usuario));
    }

    @GetMapping("/listarusuarios")
    public List<Usuario> findAll(){
        System.out.println(usuarioRepository.findAll().size());
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")

    public ResponseEntity<Usuario> buscarPorID(@PathVariable Long id){
        return usuarioRepository.findById(id)
                .map(usuario -> ResponseEntity.ok(usuario))
                .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/id")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuarioRepository.delete(usuario);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }


}
