package io.github.GleicianeKelly.mscartoes.application;

import io.github.GleicianeKelly.mscartoes.domain.ClienteCartao;
import io.github.GleicianeKelly.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository clienteCartaoRepository;


    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return clienteCartaoRepository.findByCpf(cpf);
    }
}
