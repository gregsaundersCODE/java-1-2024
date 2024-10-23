package assignments;

/**
 * public class for a product that has 3 objects: an id for the product that is an integer,
 * a description of the product whiich is a string,
 * and a price for the product that is a duble value.
 */
public class Product {

private int id;
private String description;
private double price;

    /**
     * setting the values of the objects for the product class.
     * checks to make sure id and price are positive.
     * @param id
     * @param description
     * @param price
     */
    public Product(int id, String description, double price) {
    while (id >= 0)
        this.id = id;
    this.description = description;
    while (price >= 0.0)
        this.price = price;
    }

    /**
     * getter for id
     * @returns id
     */
    public int getId() {
        return id;
    }

    /**
     * setter for id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter for description.
     * @returns description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for description.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter for price
     * @returns price
     */
    public double getPrice() {
        return price;
    }

    /**
     * setter for price.
     * checks that the price is positive.
     * @param price
     */
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
