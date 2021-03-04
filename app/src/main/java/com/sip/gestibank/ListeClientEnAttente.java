package com.sip.gestibank;

public class ListeClientEnAttente {
    private String name;
    private String email;
    private String status;


    public ListeClientEnAttente(String name, String email, String status) {
        this.name = name;
        this.email = email;
        this.status = status;
    }


    public String getName() {return name;}
    public void setName(String name) {this.name=name;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email=email;}


    public String getStatus() {return status;}
    public void setStatus(String status) {this.status=status;}

    @Override
    public String toString() {
        return this.name + "|" + this.email+ "|" + this.status;
    }

}





//    public String getNom() { return nom;}
//    public String getEmail() {
//        return email;
//    }
//    public Integer getPhone() {
//        return phone;
//    }
//    public String getStatus() {
//        return status;
//    }

