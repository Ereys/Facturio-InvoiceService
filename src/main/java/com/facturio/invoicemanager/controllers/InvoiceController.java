package com.facturio.invoicemanager.controllers;


import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.services.InvoiceManagerResponseEntity;
import com.facturio.invoicemanager.services.InvoiceServiceImpl;
import com.facturio.invoicemanager.services.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/invoicemanager/v1")
public class InvoiceController {

    @Autowired
    private InvoiceServiceInterface service;

    @PostMapping("/createInvoice")
    public ResponseEntity<?> create(@RequestBody Invoice newInvoice){
        return InvoiceManagerResponseEntity.OKResponse(201, this.service.createInvoice(newInvoice));
    }

    @GetMapping("/getAllInvoice")
    public ResponseEntity<?> getAll(){
        return InvoiceManagerResponseEntity.OKResponse(200, this.service.getAll());
    }
}
