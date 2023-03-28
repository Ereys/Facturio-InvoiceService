package com.facturio.invoicemanager.entities;


import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import jakarta.persistence.*;
import lombok.*;

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

    @Enumerated(EnumType.STRING)
    private InvoiceStatusEnum status;



}
