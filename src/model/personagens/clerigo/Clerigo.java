package model.personagens.clerigo;

import model.Arma;
import model.Item;
import model.Personagem;

public class Clerigo extends Personagem {
    private HabilidadesClerigo habilidades;
    private Arma arma;

    public Clerigo(String nome, int vida, HabilidadesClerigo habilidades, Arma arma) {
        super(nome, vida, habilidades.getPoderDeAtaque(), habilidades.getDefesa());
        this.habilidades = habilidades;
        this.arma = arma;
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

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca com a luz divina " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }

    private int calcularDano(Personagem alvo) {
        int danoBase = habilidades.getPoderDeAtaque() + arma.getBonusDeAtaque() - alvo.getDefesa();
        return Math.max(danoBase, 0);
    }
}