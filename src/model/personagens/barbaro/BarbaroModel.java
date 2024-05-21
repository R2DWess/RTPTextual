package model.personagens.barbaro;

import model.Arma;
import model.personagens.barbaro.HabilidadesBarbaro;

public class BarbaroModel {
    private String nome;
    private int vida;
    private HabilidadesBarbaro habilidades;
    private Arma arma;

    public BarbaroModel(String nome, int vida, HabilidadesBarbaro habilidades, Arma arma) {
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

    public HabilidadesBarbaro getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesBarbaro habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}