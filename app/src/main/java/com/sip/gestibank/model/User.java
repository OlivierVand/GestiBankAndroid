package com.sip.gestibank.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User  {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("email")
    @Expose
    private String email;


    @SerializedName("role")
    @Expose
    private String role;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("tel")
    @Expose
    private String tel;


    public User(String name, String email, String password, String tel)
    {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.role = "CLIENT";
        this.password = "";
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

