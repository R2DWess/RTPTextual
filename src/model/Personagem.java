package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int poderDeAtaque;
    private int defesa;
    private List<Item> inventario;

    public Personagem(String nome, int vida, int poderDeAtaque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.poderDeAtaque = poderDeAtaque;
        this.defesa = defesa;
        this.inventario = new ArrayList<>();
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

    public List<Item> getInventario() {
        return inventario;
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    public void removerItem(Item item) {
        inventario.remove(item);
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("Inventário vazio.");
        } else {
            System.out.println("Inventário:");
            for (Item item : inventario) {
                System.out.println("- " + item);
            }
        }
    }

    public abstract void atacar(Personagem alvo, Item item);

    protected int calcularDano(Personagem alvo, Item item) {
        int danoBase = poderDeAtaque + obterBonusDeAtaque(item) - alvo.getDefesa();
        return Math.max(danoBase, 0);
    }

    protected int obterBonusDeAtaque(Item item) {
        if (item instanceof Arma) {
            return ((Arma) item).getBonusDeAtaque();
        }
        return 0;
    }

    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    @Override
    public String toString() {
        return "Personagem: " + nome + " (Vida: " + vida + ", Ataque: " + poderDeAtaque + ", Defesa: " + defesa + ")";
    }
}
