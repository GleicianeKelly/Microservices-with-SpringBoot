package io.github.GleicianeKelly.msavaliandocredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Cartao {

    private Long id;
    private String nome;
    private String bandeira;
    private BigDecimal limiteBasico;

}
