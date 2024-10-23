package assignments;

/**
 * class for invoice. has one object: Invoiceitem.
 */
public class Invoice {
    private InvoiceItem InvoiceItem;

    /**
     * grabs the invoice item from the invoice item class and brings it to this class.
     * @param invoiceItem
     */
    public Invoice(assignments.InvoiceItem invoiceItem) {

        InvoiceItem = invoiceItem;
    }

    /**
     * @returns invoice item
     */
    public assignments.InvoiceItem getInvoiceItem() {
        return InvoiceItem;
    }

    /**
     * setter for InvoiceItem
     * @param invoiceItem
     */
    public void setInvoiceItem(assignments.InvoiceItem invoiceItem) {
        InvoiceItem = invoiceItem;
    }

    /**
     * getter for InvoiceItemtotal.
     * @returns the total of the invoice item
     */
    public double getInvoicetotal()    {
        return InvoiceItem.getTotal();
    }
}
