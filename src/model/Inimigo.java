package model;

public class Inimigo extends Personagem {
    public Inimigo(String nome, int vida, int poderDeAtaque, int defesa) {
        super(nome, vida, poderDeAtaque, defesa);
    }

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }
    private int calcularDano(Personagem alvo) {
        int danoBase = getPoderDeAtaque() - alvo.getDefesa();
        return Math.max(danoBase, 0);
    }

    @Override
    public void receberDano(int dano) {
        setVida(getVida() - dano);
        System.out.println(getNome() + " recebeu " + dano + " de dano. Vida restante: " + getVida());
    }
}
