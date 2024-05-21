package model;

public class Armadura extends Item {
    private int bonusDeDefesa;

    public Armadura(String nome, int bonusDeDefesa) {
        super(nome);
        this.bonusDeDefesa = bonusDeDefesa;
    }

    public Armadura(String nome, String descricao, int bonusDeDefesa) {
        super(nome, descricao);
        this.bonusDeDefesa = bonusDeDefesa;
    }

    public int getBonusDeDefesa() {
        return bonusDeDefesa;
    }

    public void setBonusDeDefesa(int bonusDeDefesa) {
        this.bonusDeDefesa = bonusDeDefesa;
    }

    @Override
    public String toString() {
        return super.toString() + " (Bônus de defesa: " + bonusDeDefesa + ")";
    }
}
