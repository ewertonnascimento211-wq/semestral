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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O nome e obrigatorio!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome e obrigatorio!") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "A idade e obrigatoria!") Integer getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A idade e obrigatoria!") Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public @NotNull(message = "Senha obrigatoria!") String getSenha() {
        return senha;
    }

    public void setSenha(@NotNull(message = "Senha obrigatoria!") String senha) {
        this.senha = senha;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

