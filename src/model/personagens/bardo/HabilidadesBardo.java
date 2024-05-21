package model.personagens.bardo;


import menu.Habilidades;

public class HabilidadesBardo extends Habilidades {
    private int inspiracao;

    public HabilidadesBardo(int poderDeAtaque, int defesa, int inspiracao) {
        super(poderDeAtaque, defesa);
        this.inspiracao = inspiracao;
    }

    public int getInspiracao() {
        return inspiracao;
    }

    public void setInspiracao(int inspiracao) {
        this.inspiracao = inspiracao;
    }
}
