package model;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem {
    private int experiencia;
    private int nivel;
    private List<Item> inventario;

    public Jogador(String nome) {
        super(nome, 100, 10, 3);
        this.experiencia = 0;
        this.nivel = 1;
        this.inventario = new ArrayList<>();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void aumentarNivel() {
        nivel++;
        setVida(getVida() + 10);
        setPoderDeAtaque(getPoderDeAtaque() + 2);
        setDefesa(getDefesa() + 1);
        System.out.println(getNome() + " subiu para o nível " + nivel + "!");
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("Inventário vazio");
        } else {
            System.out.println("Inventário:");
            for (Item item : inventario) {
                System.out.println(item);
            }
        }
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
}
