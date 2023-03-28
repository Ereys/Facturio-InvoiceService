package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.entities.Client;


import java.util.List;

public interface ClientServiceInterface {

    public Client createClient(Client newClient);
    public List<Client> getAllClient();

}
