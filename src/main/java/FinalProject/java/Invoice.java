package FinalProject.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<InvoiceItem> invoiceItems;
    private LocalDate date;
    private String paymentTerms;
    private String notes;
    private double salesTaxRate;

    public Invoice(Customer customer, LocalDate date, String paymentTerms, String notes, double salesTaxRate) {
        this.customer = customer;
        this.invoiceItems = new ArrayList<>();
        this.date = date;
        this.paymentTerms = paymentTerms;
        this.notes = notes;
        this.salesTaxRate = salesTaxRate;
    }

    public Invoice(Customer customer, String date, String paymentTerms, String notes, double salesTaxRate) {
    }

    // Add an InvoiceItem
    public void addInvoiceItem(InvoiceItem item) {
        invoiceItems.add(item);
    }

    // Remove an InvoiceItem
    public void removeInvoiceItem(InvoiceItem item) {
        invoiceItems.remove(item);
    }

    // Calculate the subtotal (before tax)
    public double getInvoiceTotal() {
        double subtotal = 0.0;
        for (InvoiceItem item : invoiceItems) {
            subtotal += item.getItemTotal();
        }
        return subtotal;
    }

    // Calculate the total including sales tax
    public double getInvoiceTotalWithTax() {
        return getInvoiceTotal() * (1 + salesTaxRate);
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public String getNotes() {
        return notes;
    }

    public double getSalesTaxRate() {
        return salesTaxRate;
    }

    // Invoice details as a String
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Header
        sb.append("----------------------------------------------------------------------\n");
        sb.append("                               AUTO BODY SHOP                    \n");
        sb.append("                               INVOICE #67890                                  \n");
        sb.append("----------------------------------------------------------------------\n");
        sb.append("Customer Name: ").append(customer.getName()).append("\n");
        sb.append("Customer Email: ").append(customer.getEmail()).append("\n");
        sb.append("Customer Address: ").append(customer.getAddress()).append("\n");
        sb.append("\n");
        sb.append("Date: ").append(date).append("\n");
        sb.append("Payment Terms: ").append(paymentTerms).append("\n");
        sb.append("Notes: ").append(notes).append("\n");
        sb.append("\n");
        sb.append("------------------------------------------------------------\n");
        sb.append("| # | Description                                      | Qty | Unit Price |   Total   |\n");
        sb.append("------------------------------------------------------------\n");

        // Line items
        int count = 1;
        for (InvoiceItem item : invoiceItems) {
            sb.append(String.format("| %d | %-30s | %3s | %10.2f | %10.2f |\n",
                    count++,
                    item.getBillable().getBillingDetails(),
                    item.getQuantity() > 0 ? item.getQuantity() : item.getBillable().getDescription(),
                    item.getBillable().getPrice(),
                    item.getItemTotal()));
        }

        // Subtotal, tax, and total
        sb.append("----------------------------------------------------------------------\n");
        sb.append(String.format("|                             Subtotal:                $%.2f |\n", getInvoiceTotal()));
        sb.append(String.format("|                        Sales Tax (%.0f%%):                $%.2f |\n", salesTaxRate * 100, getInvoiceTotal() * salesTaxRate));
        sb.append(String.format("|                                TOTAL:                $%.2f |\n", getInvoiceTotalWithTax()));
        sb.append("----------------------------------------------------------------------\n");

        sb.append("** Notes: All sales are final unless otherwise stated. For inquiries, contact us! **\n");
        sb.append("For questions or concerns, contact us at (555) 555-6789. **");
        return sb.toString();
    }

    public double calculateSubtotal() {
        return getInvoiceTotal();
    }

    public double calculateTax() {
        return getInvoiceTotal() * salesTaxRate;
    }

    public double calculateTotal() {
        return getInvoiceTotalWithTax();
    }

    public String getInvoiceDate() {
        return date.toString();
    }
}