package io.github.CarolinaCedro.msclients.infra.repository;

import io.github.CarolinaCedro.msclients.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findByCpf(String cpf);

}
