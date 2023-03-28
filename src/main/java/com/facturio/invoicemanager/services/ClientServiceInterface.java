package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.dtos.ClientRequestDTO;
import com.facturio.invoicemanager.entities.Client;


import java.util.List;

public interface ClientServiceInterface {

    public Client createClient(ClientRequestDTO newClient);
    public List<Client> getAllClient();

}
