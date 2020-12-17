package Model;

import java.util.Date;

public class Subscription {
    private double price;
    private String description;
    private Date purchaseDate;
    private int validity;
    private double discount;

    public Subscription(double price, String description, Date purchaseDate, int validity, double discount) {
        this.price = price;
        this.description = description;
        this.purchaseDate = purchaseDate;
        this.validity = validity;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
