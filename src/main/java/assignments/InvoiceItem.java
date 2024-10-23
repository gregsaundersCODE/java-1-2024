package assignments;

/**
 * class for invoice item. has 2 objects: a product, and a quantity which is an integer.
 */
public class InvoiceItem {

    private Product product;
    private int quantity;

    /**
     * setting the values for the invoice item.
     * checks to make sure quantity is a positive number.
     * @param product
     * @param quantity
     */
    public InvoiceItem(Product product, int quantity)   {
        this.product = product;
        while(quantity >=0)
            this.quantity = quantity;
    }

    /**
     * getter for product.
     * @returns product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * setter for product.
     * @param product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * getter for quantity.
     * @returns quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * setter for quantity.
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * getter for total.
     * @returns the quantity multiplied by the price of the product.
     */
    public double getTotal()    {
        return this.quantity * this.product.getPrice();
    }
}
