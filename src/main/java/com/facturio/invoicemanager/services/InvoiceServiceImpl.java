package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.dtos.CreateInvoiceDTO;
import com.facturio.invoicemanager.entities.Client;
import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import com.facturio.invoicemanager.exceptions.ClientNotFoundException;
import com.facturio.invoicemanager.repositories.ClientRepository;
import com.facturio.invoicemanager.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceServiceInterface{

    @Autowired
    private InvoiceRepository invoiceRepo;

    @Autowired
    private ClientRepository clientRepo;

    @Override
    public Invoice createInvoice(CreateInvoiceDTO newInvoice) throws ClientNotFoundException {
        Client target = this.clientRepo.findClientByLastname(newInvoice.getClientName());
        if(target == null){
            throw  new ClientNotFoundException("Client not found");
        }
        return this.invoiceRepo.save(Invoice.builder().amount(newInvoice.getAmount())
                .dateSend(LocalDate.now())
                .status(newInvoice.getStatus())
                .reference(target).build());
    }
    @Override
    public void setInvoiceStatus(Long id, InvoiceStatusEnum status) {
        Invoice target = this.invoiceRepo.findById(id).orElseThrow();
        target.setStatus(status);
    }
    @Override
    public List<Invoice> getAll() {
        return this.invoiceRepo.findAll();
    }

    @Override
    public List<Invoice> sortByStatus(InvoiceStatusEnum enums) {
        return this.invoiceRepo.findInvoiceByStatus(enums);
    }
}
