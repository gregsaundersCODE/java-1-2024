package FinalProject.java;

public class InvoiceItem {
    private Billable billable;
    private int quantity;

    public InvoiceItem(Billable billable, int quantity) {
        this.billable = billable;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        if (billable instanceof Service) {
            return ((Service) billable).getPrice() * ((Service) billable).getHours();
        }
        return billable.getPrice() * quantity;
    }

    public String getDetails() {
        return billable.getBillingDetails();
    }

    public int getQuantity() {
        return quantity;
    }

    public Billable getBillable() {
        return billable;
    }

    public Billable getBillableItem() {
        return billable;
    }
}
