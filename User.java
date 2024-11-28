/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asmjava3;

/**
 *
 * @author pc
 */
public class User {
    private String User;
    private  String Password;
    private boolean role;

    public User() {
    }

    public User(String User, String Password, boolean role) {
        this.User = User;
        this.Password = Password;
        this.role = role;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
