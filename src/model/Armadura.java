public class Armadura extends Item {
    private int bonusDeDefesa;

    // Construtor da classe Armadura
    public Armadura(String nome, int bonusDeDefesa) {
        super(nome);
        this.bonusDeDefesa = bonusDeDefesa;
    }

    // Método getter para o bônus de defesa
    public int getBonusDeDefesa() {
        return bonusDeDefesa;
    }

    // Método setter para o bônus de defesa
    public void setBonusDeDefesa(int bonusDeDefesa) {
        this.bonusDeDefesa = bonusDeDefesa;
    }

    // Método para representar a armadura como uma string
    @Override
    public String toString() {
        return super.toString() + " (Bônus de defesa: " + bonusDeDefesa + ")";
    }
}
