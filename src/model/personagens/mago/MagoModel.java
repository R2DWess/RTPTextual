package model.personagens.mago.model;

import model.Arma;
import model.personagens.mago.HabilidadesMago;

public class MagoModel {
    private String nome;
    private int vida;
    private HabilidadesMago habilidades;
    private Arma arma;

    public MagoModel(String nome, int vida, HabilidadesMago habilidades, Arma arma) {
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

    public HabilidadesMago getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesMago habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}