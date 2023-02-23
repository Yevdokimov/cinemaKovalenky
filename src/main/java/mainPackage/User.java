package mainPackage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


public class User {
    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;
    private boolean administration;

    public User(String name, String surname, int age, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.administration = false;
    }
}

