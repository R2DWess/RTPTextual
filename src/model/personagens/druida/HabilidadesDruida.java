package model.personagens.druida;

import menu.Habilidades;

public class HabilidadesDruida extends Habilidades {
    private int energiaNatural;

    public HabilidadesDruida(int poderDeAtaque, int defesa, int energiaNatural) {
        super(poderDeAtaque, defesa);
        this.energiaNatural = energiaNatural;
    }

    public int getEnergiaNatural() {
        return energiaNatural;
    }

    public void setEnergiaNatural(int energiaNatural) {
        this.energiaNatural = energiaNatural;
    }
}