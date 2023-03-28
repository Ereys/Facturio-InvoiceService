package com.facturio.invoicemanager.services;

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
    public Client createClient(Client newClient) {
        return this.clientRepo.save(newClient);
    }

    @Override
    public List<Client> getAllClient() {
        return this.clientRepo.findAll();
    }
}
