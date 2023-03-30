package com.facturio.invoicemanager.dtos;


import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateInvoiceDTO {

    private double amount;

    private InvoiceStatusEnum status;
    private String clientName;
}
