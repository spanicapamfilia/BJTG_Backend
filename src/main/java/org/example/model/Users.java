package org.example.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "db_login")
public class Users {

    @Id
    private String username;
    private String pass;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return pass;
    }

    public void setUsername(){
        this.username = username;
    }

    public void setPassword(){
        this.pass= pass;
    }
    @Override
    public String toString() {
        return "Users{" + "Username='" + username + '\'' + ", Password='" + pass + '\'' + '}';
    }
}
