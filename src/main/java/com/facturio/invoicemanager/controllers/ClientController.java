package com.facturio.invoicemanager.controllers;


import com.facturio.invoicemanager.dtos.ClientRequestDTO;
import com.facturio.invoicemanager.entities.Client;
import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import com.facturio.invoicemanager.services.ClientServiceInterface;
import com.facturio.invoicemanager.services.InvoiceManagerResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("api/invoicemanager/v1")
public class ClientController {

    @Autowired
    private ClientServiceInterface service;

    @PostMapping("/clients")
    public ResponseEntity<?> create(@RequestBody ClientRequestDTO client){
        return InvoiceManagerResponseEntity.OKResponse(201, this.service.createClient(client));
    }

    @GetMapping("/clients")
    public ResponseEntity<?> getAll() {
        return InvoiceManagerResponseEntity.OKResponse(200, this.service.getAllClient());
    }

    @GetMapping("/clients/searchByName/{name}")
    public ResponseEntity<?> searchByName(@PathVariable(name = "name") String pattern) {
        return InvoiceManagerResponseEntity.OKResponse(200, this.service.findClientByLastnameContaining(pattern));
    }
}
