package assignments;

public class InvoiceTester {
    public static void main(String[] args) {
        System.out.println("Invoice Tester");

        Product product = new Product(2, Pants, 42.99);

        InvoiceItem invoiceItem = new InvoiceItem(product, 15);

        System.out.printf("Invoice Information: Qty %d \t%s \t$%.2f",
                invoiceItem.getQuantity(),
                invoiceItem.getProduct().getDescription(),
                invoiceItem.getTotal());

    }
}
