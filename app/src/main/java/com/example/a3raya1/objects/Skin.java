package com.example.a3raya1.objects;

public class Skin {
    public String nom;
    public int foto;

    public Skin(String nom, int foto){
        this.nom = nom;
        this.foto = foto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
