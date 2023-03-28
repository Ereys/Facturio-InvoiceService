package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import com.facturio.invoicemanager.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceServiceInterface{

    @Autowired
    private InvoiceRepository invoiceRepo;

    @Override
    public Invoice createInvoice(Invoice newInvoice) {
        return this.invoiceRepo.save(newInvoice);
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
