package FinalProject.java;

public class Product extends Billable {
    public Product(int id, String description, double price) {
        super(id, description, price);
    }

    @Override
    public String getBillingDetails() {
        return getDescription() + " (Product)";
    }

    @Override
    public double getUnitPrice() {
        return getPrice();
    }
}
