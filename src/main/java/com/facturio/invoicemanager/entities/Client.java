package com.facturio.invoicemanager.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity @Table(name="F_Client")
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idClient;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String address;
}
