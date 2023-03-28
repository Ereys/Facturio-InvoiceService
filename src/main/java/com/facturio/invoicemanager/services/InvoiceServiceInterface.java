package com.facturio.invoicemanager.services;

import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;

import java.util.List;

public interface InvoiceServiceInterface {

    public Invoice createInvoice(Invoice newInvoice);
    public void setInvoiceStatus(Long id, InvoiceStatusEnum status);

    public List<Invoice> getAll();

    public List<Invoice> sortByStatus(InvoiceStatusEnum enums);
}
