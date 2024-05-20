public class Inimigo extends Personagem {
    // Construtor da classe Inimigo
    public Inimigo(String nome, int vida, int poderDeAtaque, int defesa) {
        super(nome, vida, poderDeAtaque, defesa);
    }

    // Método para atacar um alvo
    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + "!");
        int dano = calcularDano(alvo);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }

    // Método para calcular o dano causado ao alvo
    private int calcularDano(Personagem alvo) {
        int danoBase = getPoderDeAtaque() - alvo.getDefesa();
        return Math.max(danoBase, 0); // Garante que o dano mínimo seja 0
    }

    // Método para receber dano
    @Override
    public void receberDano(int dano) {
        setVida(getVida() - dano);
        System.out.println(getNome() + " recebeu " + dano + " de dano. Vida restante: " + getVida());
    }
}
