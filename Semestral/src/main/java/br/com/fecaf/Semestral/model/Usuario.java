package br.com.fecaf.Semestral.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
public class Usuario {

    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String senha;
}

