package model.personagens.barbaro;

import model.Arma;
import model.Item;
import model.Personagem;

public class Barbaro extends Personagem {
    private HabilidadesBarbaro habilidades;
    private Arma arma;

    public Barbaro(String nome, int vida, HabilidadesBarbaro habilidades, Arma arma) {
        super(nome, vida, habilidades.getPoderDeAtaque(), habilidades.getDefesa());
        this.habilidades = habilidades;
        this.arma = arma;
        adicionarItem(arma);
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

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo, item);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }
}
