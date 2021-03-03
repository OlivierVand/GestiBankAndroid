package com.sip.gestibank;

public class ListeClientEnAttente {
    private String nom;
    private String email;
    private String status;


    public ListeClientEnAttente(String nom, String email, String status) {
        this.nom = nom;
        this.email = email;
        this.status = status;
    }


    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom=nom;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email=email;}


    public String getStatus() {return status;}
    public void setStatus(String status) {this.status=status;}

    @Override
    public String toString() {
        return this.nom + "|" + this.email+ "|" + this.status;
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

