package com.sip.gestibank;

public class ListeClientEnAttente {
    private String nom;
    private String email;
    private Integer phone;
    private String status;

    private boolean active;

    public ListeClientEnAttente(String nom, String email, Integer phone, String status) {
        this.nom = nom;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.active = true;
    }

    public ListeClientEnAttente(String nom, String email, Integer phone, String status, boolean active) {
        this.nom = nom;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.active = active;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom=nom;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email=email;}

    public Integer getPhone() {return phone;}
    public void setPhone(Integer phone) {this.phone=phone;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status=status;}

    public boolean isActive() {return active;}
    public void setActive(boolean active) {this.active = active;}

    @Override
    public String toString() {
        return this.nom + "  " + this.email+ "  " + this.phone+ "  " + this.status;
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

