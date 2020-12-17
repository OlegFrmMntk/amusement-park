package Model;

public class Authorization {
    private String login;
    private String password;

    public boolean authentication(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}
