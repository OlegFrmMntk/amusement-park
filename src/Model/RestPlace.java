package Model;

public class RestPlace extends ParkObject {

    private String type;
    private int seatsNumber;

    public RestPlace(String name, String description, Location location, String type, int seatsNumber) {
        super(name, description, location);
        this.type = type;
        this.seatsNumber = seatsNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public void showInformation() {

    }
}
