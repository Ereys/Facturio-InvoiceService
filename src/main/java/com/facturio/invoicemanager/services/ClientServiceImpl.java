package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.dtos.ClientRequestDTO;
import com.facturio.invoicemanager.entities.Client;
import com.facturio.invoicemanager.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientServiceInterface{

    @Autowired
    private ClientRepository clientRepo;

    @Override
    public Client createClient(ClientRequestDTO newClient) {
        return this.clientRepo.save(Client.builder().
                                firstname(newClient.getFirstname())
                                .lastname(newClient.getFirstname())
                                .email(newClient.getEmail())
                                .address(newClient.getAddress()).build());
    }

    @Override
    public List<Client> getAllClient() {
        return this.clientRepo.findAll();
    }
}
