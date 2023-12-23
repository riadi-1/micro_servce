package com.emsi.service_client.Controller;

import com.emsi.service_client.Entity.Client;
import com.emsi.service_client.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public List<Client> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Client client){
        service.addClient(client);
    }
}
