package Model;

public class Administrator {
    private String name;
    private int id;
    private String password;

    public Administrator(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
