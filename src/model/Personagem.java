public class Personagem {
    private String nome;
    private int vida;
    private int poderDeAtaque;
    private int defesa;

    // Construtor da classe Personagem
    public Personagem(String nome, int vida, int poderDeAtaque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.poderDeAtaque = poderDeAtaque;
        this.defesa = defesa;
    }

    // Métodos getters e setters
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

    // Método para atacar um alvo
    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + "!");
        int dano = calcularDano(alvo);
        alvo.receberDano(dano);
        System.out.println(nome + " causou " + dano + " de dano.");
    }

    // Método para calcular o dano causado ao alvo
    private int calcularDano(Personagem alvo) {
        int danoBase = poderDeAtaque - alvo.getDefesa();
        return Math.max(danoBase, 0); // Garante que o dano mínimo seja 0
    }

    // Método para receber dano
    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }
}
