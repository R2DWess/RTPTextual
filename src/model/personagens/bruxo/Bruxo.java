package model.personagens.bruxo;

import model.Arma;
import model.Item;
import model.Personagem;

public class Bruxo extends Personagem {
    private HabilidadesBruxo habilidades;
    private Arma arma;

    public Bruxo(String nome, int vida, HabilidadesBruxo habilidades, Arma arma) {
        super(nome, vida, habilidades.getPoderDeAtaque(), habilidades.getDefesa());
        this.habilidades = habilidades;
        this.arma = arma;
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

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca com magia arcana " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }

    private int calcularDano(Personagem alvo) {
        int danoBase = habilidades.getPoderDeAtaque() + arma.getBonusDeAtaque() - alvo.getDefesa();
        return Math.max(danoBase, 0);
    }
}