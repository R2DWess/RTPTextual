package model;

public class Inimigo extends Personagem {
    public Inimigo(String nome, int vida, int poderDeAtaque, int defesa) {
        super(nome, vida, poderDeAtaque, defesa);
        adicionarItem(new Arma("Garras", 0)); // Adicionando item padrão para todos os inimigos
    }

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo, item);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }
}
