package br.com.fecaf.Semestral.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
//    @GetMapping
//    public String usuario(){
//        return "Aqui vao ficar os usuarios cadastrados";
//    }

    @GetMapping
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("Testanto");
    }
}
