package br.com.fecaf.Semestral.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Endereco {
    private Long id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String cep;
    private int numero;

}
