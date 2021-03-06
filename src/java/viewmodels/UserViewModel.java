/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodels;

import models.User;

/**
 *
 * @author 789439
 */
public class UserViewModel {
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    
    public UserViewModel(User user) {
        username = user.getUsername();
        password = user.getPassword();
        email = user.getEmail();
        firstname = user.getFirstname();
        lastname = user.getLastname();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}
