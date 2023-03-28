package com.facturio.invoicemanager.dtos;

import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ClientRequestDTO {
    private String lastname;
    private String firstname;
    private String email;
    private String address;
}
