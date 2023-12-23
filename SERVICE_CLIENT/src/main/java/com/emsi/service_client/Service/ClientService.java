package com.emsi.service_client.Service;


import com.emsi.service_client.Entity.Client;
import com.emsi.service_client.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findById(Long id) throws Exception{
        return clientRepository.findById(id).orElseThrow(()->new Exception("INVALID CLIENT ID"));

    }

    public void addClient(Client client){
        clientRepository.save(client);
    }
}
