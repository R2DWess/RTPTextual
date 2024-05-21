package model.personagens.mago;

import model.Arma;
import model.Jogador;
import model.Item;
import model.Personagem;

public class Mago extends Jogador {
    private HabilidadesMago habilidades;
    private Arma arma;

    public Mago(String nome, int vida, HabilidadesMago habilidades, Arma arma) {
        super(nome, vida, habilidades.getPoderDeAtaque(), habilidades.getDefesa());
        this.habilidades = habilidades;
        this.arma = arma;
        adicionarItem(arma);
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

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo, item);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }
}
