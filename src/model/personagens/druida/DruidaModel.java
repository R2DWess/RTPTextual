package model.personagens.druida;

import model.Arma;
import model.personagens.druida.HabilidadesDruida;

public class DruidaModel {
    private String nome;
    private int vida;
    private HabilidadesDruida habilidades;
    private Arma arma;

    public DruidaModel(String nome, int vida, HabilidadesDruida habilidades, Arma arma) {
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

    public HabilidadesDruida getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(HabilidadesDruida habilidades) {
        this.habilidades = habilidades;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}