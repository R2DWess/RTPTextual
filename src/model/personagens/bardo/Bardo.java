package model.personagens.bardo;

import model.Arma;
import model.Item;
import model.Personagem;

public class Bardo extends Personagem {
    private HabilidadesBardo habilidades;
    private Arma arma;

    public Bardo(String nome, int vida, HabilidadesBardo habilidades, Arma arma) {
        super(nome, vida, habilidades.getPoderDeAtaque(), habilidades.getDefesa());
        this.habilidades = habilidades;
        this.arma = arma;
        adicionarItem(arma);
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

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo, item);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }
}
