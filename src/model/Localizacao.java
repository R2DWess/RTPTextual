package model;

import model.Inimigo;

import java.util.ArrayList;
import java.util.List;

public class Localizacao {
    private String nome;
    private List<Inimigo> inimigos;

    public Localizacao(String nome) {
        this.nome = nome;
        this.inimigos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
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
}
