package model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.context.annotation.Bean;

import java.util.Objects;
public class User {

    String user;

    String password;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user1)) return false;
        return Objects.equals(user, user1.user) && Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }
}
