package com.example.mycars.form;


public class CarForm { // classe du formaulaire

    private Integer id;
    private String modele; // attribut ref
    private String marque; // attribut brand


    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getModele() {
        return modele;
    } // getter ref

    public void setModele(String modele) {
        this.modele = modele;
    } // setter ref

    public String getMarque() {
        return marque;
    } // getter brand

    public void setMarque(String marque) { // setter brand
        this.marque = marque;
    }

}