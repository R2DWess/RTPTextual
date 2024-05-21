package model.personagens.feiticeiro.model;

import model.Arma;
import model.personagens.feiticeiro.HabilidadesFeiticeiro;

public class FeiticeiroModel {
    private String nome;
    private int vida;
    private HabilidadesFeiticeiro habilidades;
    private Arma arma;

    public FeiticeiroModel(String nome, int vida, HabilidadesFeiticeiro habilidades, Arma arma) {
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

    public HabilidadesFeiticeiro getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesFeiticeiro habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}