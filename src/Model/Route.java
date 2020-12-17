package Model;

import java.util.List;

public class Route {

    public List<Location> locations;

    public Route() {
    }

    public Route(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void show(Route route) {

    }
}
