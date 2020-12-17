package Model;

public class Attraction extends ParkObject {
    private double purchasePrice;
    private double ticketPrice;
    private double repairPrice;
    private int ageLimit;
    private double state;

    public Attraction(String name, String description, Location location, double purchasePrice, double ticketPrice,
                      double repairPrice, int ageLimit, double state) {

        super(name, description, location);
        this.purchasePrice = purchasePrice;
        this.ticketPrice = ticketPrice;
        this.repairPrice = repairPrice;
        this.ageLimit = ageLimit;
        this.state = state;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(double repairPrice) {
        this.repairPrice = repairPrice;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    @Override
    public void showInformation() {

    }

}
