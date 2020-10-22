package Classes;

public class User implements iUser {
    private String name;
    private String pass;
    private String tel;

    public User(String name, String pass, String tel) {
        this.name = name;
        this.pass = pass;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String getFullInfo() {
        return this.name + " " + this.pass + " " + this.tel;
    }
}
