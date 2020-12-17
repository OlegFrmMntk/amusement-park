package Controller;

import Model.Authorization;
import Model.Budget;
import Model.ParkObject;

import java.util.List;

public class ParkManagement {
    public Authorization authorization;
    public UserManagement userManagement;
    public Budget budget;
    public List<ParkObject> parkObjects;

    public ParkManagement() {
    }

    public ParkManagement(Authorization authorization, UserManagement userManagement, Budget budget, List<ParkObject> parkObjects) {
        this.authorization = authorization;
        this.userManagement = userManagement;
        this.budget = budget;
        this.parkObjects = parkObjects;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public UserManagement getUserManagement() {
        return userManagement;
    }

    public void setUserManagement(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public List<ParkObject> getParkObjects() {
        return parkObjects;
    }

    public void setParkObjects(List<ParkObject> parkObjects) {
        this.parkObjects = parkObjects;
    }

    public void execute() {

    }

}
