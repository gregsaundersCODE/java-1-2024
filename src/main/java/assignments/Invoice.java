package assignments;

public class Invoice {
    private InvoiceItem InvoiceItem;

    public Invoice(assignments.InvoiceItem invoiceItem) {

        InvoiceItem = invoiceItem;
    }

    public assignments.InvoiceItem getInvoiceItem() {
        return InvoiceItem;
    }

    public void setInvoiceItem(assignments.InvoiceItem invoiceItem) {
        InvoiceItem = invoiceItem;
    }

    public double getInvoicetotal()    {
        return InvoiceItem.getTotal();
    }
}
