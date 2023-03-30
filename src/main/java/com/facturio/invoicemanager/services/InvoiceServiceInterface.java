package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.dtos.CreateInvoiceDTO;
import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import com.facturio.invoicemanager.exceptions.ClientNotFoundException;

import java.util.List;

public interface InvoiceServiceInterface {

    public Invoice createInvoice(CreateInvoiceDTO newInvoice) throws ClientNotFoundException;
    public void setInvoiceStatus(Long id, InvoiceStatusEnum status);

    public List<Invoice> getAll();

    public List<Invoice> sortByStatus(InvoiceStatusEnum enums);
}
