package spring_boot_db_a;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User {
    private Integer id;
    private String name;
    private String email;

    public User(int i, String string, String string2) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
