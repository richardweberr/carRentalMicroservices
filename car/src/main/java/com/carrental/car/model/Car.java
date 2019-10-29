package com.carrental.car.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String marque;
    private String modele;
    private String couleur;
    private String immatriculation;
    private int prix;
    private int tarif_km;
    private int CV;
    private String image_url;

    public Car(int id, String marque, String modele, String couleur, String immatriculation, int prix, int tarifKilometrique, int CV, String imageURL) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.immatriculation = immatriculation;
        this.prix = prix;
        this.tarif_km = tarifKilometrique;
        this.CV = CV;
        this.image_url = imageURL;
    }
    public Car(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String  getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getTarifKilometrique() {
        return tarif_km;
    }

    public void setTarifKilometrique(int tarifKilometrique) {
        this.tarif_km = tarifKilometrique;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public String getImageURL() {
        return image_url;
    }

    public void setImageURL(String imageURL) {
        this.image_url = imageURL;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", immatriculation=" + immatriculation +
                ", prix=" + prix +
                ", tarifKilometrique=" + tarif_km +
                ", CV=" + CV +
                ", imageURL='" + image_url + '\'' +
                '}';
    }
}
