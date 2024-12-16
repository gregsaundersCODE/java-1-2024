package FinalProject.java;

import java.util.List;
import java.util.Arrays;

public class BillableItemsDatabase {
    private List<Product> products = Arrays.asList(
            new Product(101, "Windshield Wiper Blades", 25.99),
            new Product(102, "Engine Oil (5W-30, 1 Quart)", 9.99),
            new Product(103, "Air Filter", 15.50),
            new Product(104, "Brake Pads (Set of 2)", 55.00),
            new Product(105, "Tire (All-Season, Single)", 110.00)
    );

    private List<Service> services = Arrays.asList(
            new Service(201, "Oil Change", 40.00, 1),
            new Service(202, "Tire Rotation", 35.00, 1),
            new Service(203, "Brake Inspection and Replacement", 60.00, 2),
            new Service(204, "Engine Diagnostic", 80.00, 1)
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public List<Service> getAllServices() {
        return services;
    }

    public Billable findById(int id) {
        // Check products
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        // Check services
        for (Service service : services) {
            if (service.getId() == id) {
                return service;
            }
        }

        // Return null if no match is found
        return null;
    }
}