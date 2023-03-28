package com.facturio.invoicemanager.repositories;

import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    public List<Invoice> findInvoiceByStatus(InvoiceStatusEnum status);
}
