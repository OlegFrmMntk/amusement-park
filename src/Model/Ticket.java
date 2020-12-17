package Model;

import java.util.Date;
import java.util.List;

public class Ticket {
    private double price;
    private Date purchaseDate;
    private int validity;
    private Date useDate;
    public ParkObject parkObject;

    public Ticket(double price, Date purchaseDate, int validity, Date useDate) {
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.validity = validity;
        this.useDate = useDate;
    }

    public Ticket(double price, Date purchaseDate, int validity, Date useDate, ParkObject parkObject) {
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.validity = validity;
        this.useDate = useDate;
        this.parkObject = parkObject;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public double getPrice() {
        return price;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public int getValidity() {
        return validity;
    }

    public Date getUseDate() {
        return useDate;
    }

    public ParkObject getParkObject() {
        return parkObject;
    }

    public void setParkObject(ParkObject parkObject) {
        this.parkObject = parkObject;
    }
}
