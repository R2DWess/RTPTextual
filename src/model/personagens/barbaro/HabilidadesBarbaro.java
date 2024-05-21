package model.personagens.barbaro;


import menu.Habilidades;

public class HabilidadesBarbaro extends Habilidades {
    private int furia;

    public HabilidadesBarbaro(int poderDeAtaque, int defesa, int furia) { // Construtor com os parâmetros necessários
        super(poderDeAtaque, defesa);
        this.furia = furia;
    }

    public int getFuria() {
        return furia;
    }

    public void setFuria(int furia) {
        this.furia = furia;
    }
}
