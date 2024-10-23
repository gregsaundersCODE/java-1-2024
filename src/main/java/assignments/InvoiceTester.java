package assignments;

/**
 * the main function. accesses Product.java, InvoiceItem.java, and Invoice.java.
 *
 * displays "Invoice Tester"
 *
 * instanciates a product called product.
 * has an id which is an integer, a description which is a string, and a price which is a double value.
 *
 * instanciates an invoice item called invoiceItem.
 * has a product which is it's own class, and a quantity which is an integer.
 *
 * displays the quantity, description of the product, and the total price of the inoice item.
 * rounds to a decimal point.
 */
public class InvoiceTester {
    public static void main(String[] args) {
        System.out.println("Invoice Tester");

        Product product = new Product(2, "Pants", 42.99);

        InvoiceItem invoiceItem = new InvoiceItem(product, 15);

        System.out.printf("Invoice Information: Qty %d \t%s \t$%.2f",
                invoiceItem.getQuantity(),
                invoiceItem.getProduct().getDescription(),
                invoiceItem.getTotal());

    }
}

