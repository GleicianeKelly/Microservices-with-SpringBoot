package io.github.GleicianeKelly.mscartoes.infra.repository;

import io.github.GleicianeKelly.mscartoes.application.representation.CartoesPorClienteResponse;
import io.github.GleicianeKelly.mscartoes.domain.ClienteCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long> {

List<ClienteCartao> findByCpf(String cpf);



}
