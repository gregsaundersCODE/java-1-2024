package FinalProject.java;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to Auto Body Shop Invoice System");
            System.out.println("1. Generate Sample Invoice");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    generateSampleInvoice();
                    break;
                case 2:
                    System.out.println("Thank you for using the Invoice System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }

    private static void generateSampleInvoice() {
        // Customer Details
        Customer customer = new Customer("Jane Smith", "jane.smith@example.com", "456 Elm Street, Springfield");

        // Create an Invoice
        Invoice invoice = new Invoice(customer, LocalDate.of(2024, 11, 20), "Net 15",
                "Payment is due within 15 days. Thank you for choosing us!", 0.13);

        // Adding Items to the Invoice
        invoice.addInvoiceItem(new InvoiceItem(new Product(101, "Engine Oil (5W-30, 1 Quart)", 9.99), 5));
        invoice.addInvoiceItem(new InvoiceItem(new Product(105, "Tire (All-Season, Single)", 110.00), 2));
        invoice.addInvoiceItem(new InvoiceItem(new Product(103, "Air Filter", 15.50), 1));
        invoice.addInvoiceItem(new InvoiceItem(new Service(203, "Brake Inspection and Replacement", 60.00, 2), 1));
        invoice.addInvoiceItem(new InvoiceItem(new Service(204, "Engine Diagnostic", 80.00, 1), 1));

        // Print the Invoice
        System.out.println(invoice);
    }
}
