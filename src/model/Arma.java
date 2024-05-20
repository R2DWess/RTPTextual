public class Arma extends Item {
    private int bonusDeAtaque;

    // Construtor da classe Arma
    public Arma(String nome, int bonusDeAtaque) {
        super(nome);
        this.bonusDeAtaque = bonusDeAtaque;
    }

    // Método getter para o bônus de ataque
    public int getBonusDeAtaque() {
        return bonusDeAtaque;
    }

    // Método setter para o bônus de ataque
    public void setBonusDeAtaque(int bonusDeAtaque) {
        this.bonusDeAtaque = bonusDeAtaque;
    }

    // Método para representar a arma como uma string
    @Override
    public String toString() {
        return super.toString() + " (Bônus de ataque: " + bonusDeAtaque + ")";
    }
}
