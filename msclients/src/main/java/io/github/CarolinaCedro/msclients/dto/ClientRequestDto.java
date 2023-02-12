package io.github.CarolinaCedro.msclients.dto;

import io.github.CarolinaCedro.msclients.domain.Client;

public class ClientRequestDto {

    private String cpf;
    private String nome;
    private Integer idade;

    public Client toModel(){
        return new Client(cpf, nome, idade);
    }
}
