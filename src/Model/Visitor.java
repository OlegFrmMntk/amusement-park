package Model;

import java.util.Date;

public class Visitor {
    private String name;
    private int id;
    private String password;
    private Date birth_date;
    private boolean isVip;

    public Visitor(String name, int id, String password, Date birth_date) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.birth_date = birth_date;
        this.isVip = false;
    }

    public Visitor(String name, int id, String password, Date birth_date, boolean isVip) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.birth_date = birth_date;
        this.isVip = isVip;
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

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setVip(boolean vip) {
        isVip = vip;
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

    public Date getBirth_date() {
        return birth_date;
    }

    public boolean isVip() {
        return isVip;
    }
}
