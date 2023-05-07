/**
 * @Created by Stas Orehov
 * @Date:19/03/2023 3:05
 * @Project Name:SpringProject
 */
package com.stas.server.data;


public class UserLoginData {
    private String email;
    private String password;


    public UserLoginData() {
    }

    public UserLoginData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
