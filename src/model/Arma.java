package model;

import model.Item;

public class Arma extends Item {
    private int bonusDeAtaque;

    public Arma(String nome, int bonusDeAtaque) {
        super(nome);
        this.bonusDeAtaque = bonusDeAtaque;
    }

    public int getBonusDeAtaque() {
        return bonusDeAtaque;
    }

    public void setBonusDeAtaque(int bonusDeAtaque) {
        this.bonusDeAtaque = bonusDeAtaque;
    }

    @Override
    public String toString() {
        return super.toString() + " (Bônus de ataque: " + bonusDeAtaque + ")";
    }
}
