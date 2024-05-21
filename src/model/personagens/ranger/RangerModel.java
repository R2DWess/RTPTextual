package model.personagens.ranger.model;

import model.Arma;
import model.personagens.ranger.HabilidadesRanger;

public class RangerModel {
    private String nome;
    private int vida;
    private HabilidadesRanger habilidades;
    private Arma arma;

    public RangerModel(String nome, int vida, HabilidadesRanger habilidades, Arma arma) {
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

    public HabilidadesRanger getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesRanger habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}