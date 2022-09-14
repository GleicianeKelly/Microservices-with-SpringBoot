package io.github.GleicianeKelly.msclientes.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private Integer idade;

    public Cliente(String cpf, String nome, Integer idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }


}
