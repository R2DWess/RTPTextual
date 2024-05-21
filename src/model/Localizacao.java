package model;

import java.util.ArrayList;
import java.util.List;

public class Localizacao {
    private String nome;
    private String descricao;
    private List<Inimigo> inimigos;

    public Localizacao(String nome) {
        this.nome = nome;
        this.descricao = "";
        this.inimigos = new ArrayList<>();
    }

    public Localizacao(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.inimigos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    public void removerInimigo(Inimigo inimigo) {
        inimigos.remove(inimigo);
    }

    public boolean temInimigos() {
        return !inimigos.isEmpty();
    }

    public void mostrarInimigos() {
        if (inimigos.isEmpty()) {
            System.out.println("Não há inimigos nesta localização.");
        } else {
            System.out.println("Inimigos na localização " + nome + ":");
            for (Inimigo inimigo : inimigos) {
                System.out.println("- " + inimigo.getNome() + " (Vida: " + inimigo.getVida() + ")");
            }
        }
    }

    @Override
    public String toString() {
        return nome + (descricao.isEmpty() ? "" : " - " + descricao);
    }
}
