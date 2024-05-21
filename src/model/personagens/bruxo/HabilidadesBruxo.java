package model.personagens.bruxo;

import menu.Habilidades;

public class HabilidadesBruxo extends Habilidades {
    private int energiaArcana;

    public HabilidadesBruxo(int poderDeAtaque, int defesa, int energiaArcana) {
        super(poderDeAtaque, defesa);
        this.energiaArcana = energiaArcana;
    }

    public int getEnergiaArcana() {
        return energiaArcana;
    }

    public void setEnergiaArcana(int energiaArcana) {
        this.energiaArcana = energiaArcana;
    }
}