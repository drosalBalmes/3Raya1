package com.example.a3raya1.objects;

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private String contraseña;
    private int pJugadas;
    private int pGanadass;
    private int pPerdidas;
    private int winRate;
    private int elo;
    private int fichas = 3;
    private int skin;

    public User(String username, String contraseña, int pJugadas, int pGanadass, int pPerdidas, int winRate, int elo) {
        this.username = username;
        this.contraseña = contraseña;
        this.pJugadas = pJugadas;
        this.pGanadass = pGanadass;
        this.pPerdidas = pPerdidas;
        this.winRate = winRate;
        this.elo = elo;
    }

    public User() {
    }

    public User(String username, String contraseña) {
        this.username = username;
        this.contraseña = contraseña;
    }

    public User(String username, int pJugadas, int pGanadass, int pPerdidas, int winRate, int elo) {
        this.username = username;
        this.pJugadas = pJugadas;
        this.pGanadass = pGanadass;
        this.pPerdidas = pPerdidas;
        this.winRate = winRate;
        this.elo = elo;
    }

    //TODO: calcular winRate


    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = this.fichas-fichas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getpJugadas() {
        return pJugadas;
    }

    public void setpJugadas(int pJugadas) {
        this.pJugadas = pJugadas;
    }

    public int getpGanadass() {
        return pGanadass;
    }

    public void setpGanadass(int pGanadass) {
        this.pGanadass = pGanadass;
    }

    public int getpPerdidas() {
        return pPerdidas;
    }

    public void setpPerdidas(int pPerdidas) {
        this.pPerdidas = pPerdidas;
    }

    public int getWinRate() {
        return winRate;
    }

    public void setWinRate(int winRate) {
        this.winRate = winRate;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }
}
