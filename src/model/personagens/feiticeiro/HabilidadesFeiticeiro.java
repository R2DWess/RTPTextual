package model.personagens.feiticeiro;

import menu.Habilidades;

public class HabilidadesFeiticeiro extends Habilidades {
    private int mana;

    public HabilidadesFeiticeiro(int poderDeAtaque, int defesa, int mana) {
        super(poderDeAtaque, defesa);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}