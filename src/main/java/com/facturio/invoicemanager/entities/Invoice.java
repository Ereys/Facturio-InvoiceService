package com.facturio.invoicemanager.entities;


import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

@Entity
public class Invoice {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idInvoice;
    private double amount;
    private LocalDate dateSend;
    @Enumerated(EnumType.STRING)
    private InvoiceStatusEnum status;
}
