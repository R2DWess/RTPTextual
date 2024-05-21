package model.personagens.mago;


import menu.Habilidades;

public class HabilidadesMago extends Habilidades {
    private int mana;

    public HabilidadesMago(int poderDeAtaque, int defesa, int mana) { // Construtor com os parâmetros necessários
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
