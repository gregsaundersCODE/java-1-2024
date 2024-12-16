package FinalProject.java;

public abstract class Billable {
    private int id;
    private String description;
    private double price;

    public Billable(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getBillingDetails();

    public abstract double getUnitPrice();
}

