package com.facturio.invoicemanager.entities;


import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import jakarta.persistence.*;
import lombok.*;

import javax.annotation.Nullable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

@Entity @Table(name="F_Invoices")
public class Invoice {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idInvoice;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private LocalDate dateSend;
    @Enumerated(EnumType.STRING)
    private InvoiceStatusEnum status;
    @OneToOne
    @JoinColumn(name="client_reference", referencedColumnName = "id")
    private Client reference;
}
