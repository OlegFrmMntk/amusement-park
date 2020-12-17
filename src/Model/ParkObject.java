package Model;

public class ParkObject {
    private String name;
    private String description;
    public Location location;

    public ParkObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ParkObject(String name, String description, Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void showInformation() {

    }

}
