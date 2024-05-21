package model.personagens.clerigo;

import menu.Habilidades;

public class HabilidadesClerigo extends Habilidades {
    private int fe;

    public HabilidadesClerigo(int poderDeAtaque, int defesa, int fe) {
        super(poderDeAtaque, defesa);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
}