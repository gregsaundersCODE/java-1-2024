package FinalProject.java;

public class Service extends Billable {
    private int hours;

    public Service(int id, String description, double ratePerHour, int hours) {
        super(id, description, ratePerHour);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String getBillingDetails() {
        return getDescription() + " (Service, " + hours + " hr)";
    }

    @Override
    public double getUnitPrice() {
        return getPrice();
    }
}