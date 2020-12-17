package Model;

import java.util.Date;

public class CreditCard {
    private String ownerName;
    private int cardNumber;
    private int CVV;
    private Date expirationDate;

    public CreditCard(String ownerName, int cardNumber, int CVV, Date expirationDate) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.expirationDate = expirationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
