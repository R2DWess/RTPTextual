package model.personagens.bruxo.model;

import model.Arma;
import model.personagens.bruxo.HabilidadesBruxo;

public class BruxoModel {
    private String nome;
    private int vida;
    private HabilidadesBruxo habilidades;
    private Arma arma;

    public BruxoModel(String nome, int vida, HabilidadesBruxo habilidades, Arma arma) {
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

    public HabilidadesBruxo getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesBruxo habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}