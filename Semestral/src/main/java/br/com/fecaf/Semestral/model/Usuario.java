package br.com.fecaf.Semestral.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome e obrigatorio!")
    @Column(nullable = false)
    private String nome;

    @NotNull(message = "A idade e obrigatoria!")
    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false , unique = true)
    private String email;

    @NotNull(message = "Senha obrigatoria!")
    private String senha;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Evento> eventos = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)@JoinColumn(name = "endereco_id",referencedColumnName = "id")
    private Endereco endereco;
}

