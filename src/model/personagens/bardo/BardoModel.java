package model.personagens.bardo.model;

import model.Arma;
import model.personagens.bardo.HabilidadesBardo;

public class BardoModel {
    private String nome;
    private int vida;
    private HabilidadesBardo habilidades;
    private Arma arma;

    public BardoModel(String nome, int vida, HabilidadesBardo habilidades, Arma arma) {
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

    public HabilidadesBardo getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesBardo habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}