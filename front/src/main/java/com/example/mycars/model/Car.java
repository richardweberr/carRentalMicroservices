package com.example.mycars.model;


public class Car {
    private int id;
    private String marque;
    private String modele;
    private String couleur;
    private String immatriculation;
    private int prix;
    private int tarif_km;
    private int CV;
    private String image_url;

    public Car(int id, String marque, String modele, String couleur, String immatriculation, int prix, int tarif_km, int CV, String image_url) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.immatriculation = immatriculation;
        this.prix = prix;
        this.tarif_km = tarif_km;
        this.CV = CV;
        this.image_url = image_url;
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

    public String getImmatriculation() {
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

    public int getTarif_km() {
        return tarif_km;
    }

    public void setTarif_km(int tarif_km) {
        this.tarif_km = tarif_km;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", immatriculation='" + immatriculation + '\'' +
                ", prix=" + prix +
                ", tarif_km=" + tarif_km +
                ", CV=" + CV +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}







//public class Car { // classe Car
//
//
//    private Integer id;
//    private String modele; // attribut ref de la classe Car qui correspond au modèle
//    private String marque; // attribut brand de la class Car qui correspond à la marque
//
//    public Car() { }
//
//    public Car(Integer id, String modele, String marque) {
//        this.id = id;
//        this.modele = modele;
//        this.marque = marque;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getModele() {
//        return modele;
//    } // Getter
//
//    public void setModele(String modele) {
//        this.modele = modele;
//    }
//
//
//    public String getMarque() {
//        return marque;
//    } // Getter
//
//    public void setMarque(String marque) {
//        this.marque = marque;
//    } // Setter
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", modele='" + modele + '\'' +
//                ", marque='" + marque + '\'' +
//                '}';
//    }
//}
