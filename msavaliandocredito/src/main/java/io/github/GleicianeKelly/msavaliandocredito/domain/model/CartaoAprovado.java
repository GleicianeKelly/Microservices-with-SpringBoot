package io.github.GleicianeKelly.msavaliandocredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoAprovado {

    private String cartao;
    private String bandeira;
    private BigDecimal limiteAprovador;
}
