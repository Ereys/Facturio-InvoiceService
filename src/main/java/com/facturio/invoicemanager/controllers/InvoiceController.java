package com.facturio.invoicemanager.controllers;


import com.facturio.invoicemanager.dtos.CreateInvoiceDTO;
import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
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

    @PostMapping("/invoices")
    public ResponseEntity<?> create(@RequestBody CreateInvoiceDTO newInvoice){
        try {
            return InvoiceManagerResponseEntity.OKResponse(201, this.service.createInvoice(newInvoice));
        }catch (Exception e){
            return InvoiceManagerResponseEntity.errorResponse(400, e.getMessage());
        }
    }

    @GetMapping("/invoices")
    public ResponseEntity<?> getAll(){
        return InvoiceManagerResponseEntity.OKResponse(200, this.service.getAll());
    }

    @GetMapping("/invoice/searchByStatus")
    public ResponseEntity<?> getAll(@RequestParam(name="status") InvoiceStatusEnum status) {
        return InvoiceManagerResponseEntity
                .OKResponse(200, this.service.sortByStatus(status));
    }
}
