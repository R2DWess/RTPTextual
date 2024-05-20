package model;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int poderDeAtaque;
    private int defesa;

    public Personagem(String nome, int vida, int poderDeAtaque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.poderDeAtaque = poderDeAtaque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    public abstract void atacar(Personagem alvo, Item item);

    private int calcularDano(Personagem alvo) {
        int danoBase = poderDeAtaque - alvo.getDefesa();
        return Math.max(danoBase, 0);
    }

    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }
}