package io.github.CarolinaCedro.msclients.service;

import io.github.CarolinaCedro.msclients.domain.Client;
import io.github.CarolinaCedro.msclients.infra.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository repository;

    @Transactional
    public Client save(Client cliente){
        return repository.save(cliente);
    }

    public Optional<Client> getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }
}
