package io.github.GleicianeKelly.msavaliandocredito.domain.model;

import io.github.GleicianeKelly.msavaliandocredito.infra.mqueue.SolicitacaoEmissaoCartaoPublisher;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosSolicitacaoEmissaoCartao {

    private Long idCartao;
    private String cpf;
    private String endereco;
    private BigDecimal limiteLiberado;

    public void solicitarCartao(DadosSolicitacaoEmissaoCartao dados){

    }
}
