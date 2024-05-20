package model;

public class Missao {
    private String descricao;
    private boolean completa;

    public Missao(String descricao) {
        this.descricao = descricao;
        this.completa = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void completar() {
        this.completa = true;
    }

    @Override
    public String toString() {
        return "Missão: " + descricao + " (Completa: " + completa + ")";
    }
}
