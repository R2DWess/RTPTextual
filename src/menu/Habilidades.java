package menu;

public abstract class Habilidades {
    private int poderDeAtaque;
    private int defesa;

    public Habilidades(int poderDeAtaque, int defesa) {
        this.poderDeAtaque = poderDeAtaque;
        this.defesa = defesa;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(int poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}