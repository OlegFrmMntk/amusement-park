package Controller;

import Model.Visitor;

public class UserManagement {
    public VisitorManagement visitor;
    public AdministratorManagement administrator;

    public UserManagement() {
    }

    public UserManagement(VisitorManagement visitor, AdministratorManagement administrator) {
        this.visitor = visitor;
        this.administrator = administrator;
    }

    public VisitorManagement getVisitor() {
        return visitor;
    }

    public void setVisitor(VisitorManagement visitor) {
        this.visitor = visitor;
    }

    public AdministratorManagement getAdministrator() {
        return administrator;
    }

    public void setAdministrator(AdministratorManagement administrator) {
        this.administrator = administrator;
    }

    public boolean authorization(String login, String password) {
        return false;
    }

    public void registration(String login, String password) {

    }

}
