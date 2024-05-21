package model.personagens.clerigo.model;

import model.Arma;
import model.personagens.clerigo.HabilidadesClerigo;

public class ClerigoModel {
    private String nome;
    private int vida;
    private HabilidadesClerigo habilidades;
    private Arma arma;

    public ClerigoModel(String nome, int vida, HabilidadesClerigo habilidades, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.habilidades = habilidades;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public HabilidadesClerigo getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesClerigo habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}