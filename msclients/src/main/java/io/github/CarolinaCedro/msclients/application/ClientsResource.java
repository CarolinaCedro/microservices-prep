package io.github.CarolinaCedro.msclients.application;

import io.github.CarolinaCedro.msclients.dto.ClientRequestDto;
import io.github.CarolinaCedro.msclients.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClientsResource {


    private final ClientService clientService;

    @GetMapping
    public String status(){
       return "ok";
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ClientRequestDto request){
        var cliente = request.toModel();
        clientService.save(cliente);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(cliente.getCpf())
                .toUri();
        return ResponseEntity.created(headerLocation).build();
    }

    @GetMapping(params = "cpf")
    public ResponseEntity dadosCliente(@RequestParam("cpf") String cpf){
        var cliente = clientService.getByCPF(cpf);
        if(cliente.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }
}
