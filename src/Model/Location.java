package Model;

public class Location {
    public double firstCoordinate;
    public double secondCoordinate;

    public Location(double firstCoordinate, double secondCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }

    public double getFirstCoordinate() {
        return firstCoordinate;
    }

    public void setFirstCoordinate(double firstCoordinate) {
        this.firstCoordinate = firstCoordinate;
    }

    public double getSecondCoordinate() {
        return secondCoordinate;
    }

    public void setSecondCoordinate(double secondCoordinate) {
        this.secondCoordinate = secondCoordinate;
    }

}
