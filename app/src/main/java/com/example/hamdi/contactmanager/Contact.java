package com.example.hamdi.contactmanager;

/**
 * Created by hamdi on 18/04/15.
 */
public class Contact {

    private String nom,numTel;


    public Contact(String nom, String numTel) {
        this.nom = nom;
        this.numTel = numTel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
}
