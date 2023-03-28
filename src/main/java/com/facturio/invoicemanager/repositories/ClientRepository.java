package com.facturio.invoicemanager.repositories;

import com.facturio.invoicemanager.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    public Client findClientByFirstname(String firstname);
    public Client findClientByLastname(String lastname);
    public Client findClientByEmail(String email);
    public List<Client> findClientByLastnameStartsWith(String pattern);
}
