package com.example.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private int numero_permis;



    private Date date_obtention_permis;

    public Client(int id, String nom, String prenom, Date date_naissance, int numero_permis, Date date_obtention_permis){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.numero_permis = numero_permis;
        this.date_obtention_permis = date_obtention_permis;

    }
    public Client(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public int getNumero_permis() {
        return numero_permis;
    }

    public void setNumero_permis(int numero_permis) {
        this.numero_permis = numero_permis;
    }

    public Date getDate_obtention_permis() {
        return date_obtention_permis;
    }

    public void setDate_obtention_permis(Date date_obtention_permis) {
        this.date_obtention_permis = date_obtention_permis;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance=" + date_naissance +
                ", numero_permis=" + numero_permis +
                ", date_obtention_permis=" + date_obtention_permis +
                '}';
    }

}
