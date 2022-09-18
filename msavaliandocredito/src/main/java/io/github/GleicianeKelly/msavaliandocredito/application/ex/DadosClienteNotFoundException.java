package io.github.GleicianeKelly.msavaliandocredito.application.ex;

import io.github.GleicianeKelly.msavaliandocredito.domain.model.DadosCliente;

public class DadosClienteNotFoundException extends Exception {

    public DadosClienteNotFoundException(){
        super("Dados do cliente não encontrado para o CPF informado");
    }
}
