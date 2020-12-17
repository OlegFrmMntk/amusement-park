package Controller;

import Model.Administrator;

public class AdministratorManagement {
    public Administrator administrator;
    public VisitorsManagement visitorsManagement;
    public BudgetManagement budgetManagement;
    public AttractionManagement attractionManagement;
    public RestPlaceManagement restingPlaceManagement;

    public AdministratorManagement() {
    }

    public AdministratorManagement(Administrator administrator, VisitorsManagement visitorsManagement,
                                   BudgetManagement budgetManagement, AttractionManagement attractionManagement,
                                   RestPlaceManagement restingPlaceManagement) {

        this.administrator = administrator;
        this.visitorsManagement = visitorsManagement;
        this.budgetManagement = budgetManagement;
        this.attractionManagement = attractionManagement;
        this.restingPlaceManagement = restingPlaceManagement;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public VisitorsManagement getVisitorsManagement() {
        return visitorsManagement;
    }

    public void setVisitorsManagement(VisitorsManagement visitorsManagement) {
        this.visitorsManagement = visitorsManagement;
    }

    public BudgetManagement getBudgetManagement() {
        return budgetManagement;
    }

    public void setBudgetManagement(BudgetManagement budgetManagement) {
        this.budgetManagement = budgetManagement;
    }

    public AttractionManagement getAttractionManagement() {
        return attractionManagement;
    }

    public void setAttractionManagement(AttractionManagement attractionManagement) {
        this.attractionManagement = attractionManagement;
    }

    public RestPlaceManagement getRestingPlaceManagement() {
        return restingPlaceManagement;
    }

    public void setRestingPlaceManagement(RestPlaceManagement restingPlaceManagement) {
        this.restingPlaceManagement = restingPlaceManagement;
    }

    public void editProfile() {

    }

    public void exit() {

    }

}
