package com.facturio.invoicemanager;

import com.facturio.invoicemanager.entities.Client;
import com.facturio.invoicemanager.entities.Invoice;
import com.facturio.invoicemanager.entities.enums.InvoiceStatusEnum;
import com.facturio.invoicemanager.repositories.ClientRepository;
import com.facturio.invoicemanager.repositories.InvoiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class InvoicemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoicemanagerApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepo, InvoiceRepository invoiceRepo){
		return args -> {
			clientRepo.save(new Client(0, "Ribollet", "Pierre", "pierre.ribollet@gmail.com", "48 rue de la paquerette"));
			clientRepo.save(new Client(0, "Tavirani", "Awat", "awat.tavi@gmail.com", "48 rue du coquelicot"));
			clientRepo.save(new Client(0, "test", "testoterone", "test@test.com", "52 rue du test bis"));

			invoiceRepo.save(new Invoice(0, 12.0, LocalDate.now() ,InvoiceStatusEnum.QUOTATION));
		};
	}
}
