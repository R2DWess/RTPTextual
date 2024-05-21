package model.personagens.ranger;

import menu.Habilidades;

public class HabilidadesRanger extends Habilidades {
    private int precisao;

    public HabilidadesRanger(int poderDeAtaque, int defesa, int precisao) {
        super(poderDeAtaque, defesa);
        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }
}