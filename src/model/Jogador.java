package model;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem {
    private int experiencia;
    private int nivel;

    public Jogador(String nome, int vida, int poderDeAtaque, int defesa) {
        super(nome, vida, poderDeAtaque, defesa);
        this.experiencia = 0;
        this.nivel = 1;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void ganharExperiencia(int pontos) {
        this.experiencia += pontos;
        if (this.experiencia >= this.nivel * 10) {
            subirNivel();
        }
    }

    private void subirNivel() {
        this.nivel++;
        this.experiencia = 0;
        setVida(getVida() + 10);
        setPoderDeAtaque(getPoderDeAtaque() + 2);
        setDefesa(getDefesa() + 1);
        System.out.println(getNome() + " subiu para o nível " + this.nivel + "!");
    }

    @Override
    public void atacar(Personagem alvo, Item item) {
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + item.getNome() + "!");
        int dano = calcularDano(alvo, item);
        alvo.receberDano(dano);
        System.out.println(getNome() + " causou " + dano + " de dano.");
    }
}
