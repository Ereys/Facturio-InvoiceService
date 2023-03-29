# Facturio-InvoiceService

API url :

"api/invoicemanager/v1" : base url

Recuperer la liste des clients : GET api/invoicemanager/v1/clients
Créer un nouveau client : POST api/invoicemanager/v1/clients {"lastname", "firstname", "email", "address" }
Rechercher un client par son nom : GET api/invoicemanager/v1/clients/searchByName/{name}

Recuperer toutes les factures : GET api/invoicemanager/v1/invoices
Créer une facture : POST api/invoicemanager/v1/invoices {"amount", "status"}
Recuperer les factures ayant un status précis : GET api/invoicemanager/v1/invoices/searchByStatus?status=DELAYED
