package br.com.fecaf.Semestral.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    private String logradouro;
    private String bairro;
    private String cidade;
    @NotBlank
    private String cep;
    private int numero;

    @ManyToOne
    private Usuario usuario;

}
