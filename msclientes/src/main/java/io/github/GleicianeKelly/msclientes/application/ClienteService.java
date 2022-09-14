package io.github.GleicianeKelly.msclientes.application;

import io.github.GleicianeKelly.msclientes.domain.Cliente;
import io.github.GleicianeKelly.msclientes.infra.Repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {


    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Optional findByCpf(String cpf){
        return clienteRepository.findByCpf(cpf);
    }

}
