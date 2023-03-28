package com.facturio.invoicemanager.repositories;

import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    public Invoice findInvoiceByStatus(InvoiceStatusEnum status);
}
