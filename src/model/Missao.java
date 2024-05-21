package model;

public class Missao {
    private String descricao;
    private boolean completa;
    private int recompensaExperiencia;
    private String recompensaItem;

    public Missao(String descricao, int recompensaExperiencia, String recompensaItem) {
        this.descricao = descricao;
        this.completa = false;
        this.recompensaExperiencia = recompensaExperiencia;
        this.recompensaItem = recompensaItem;
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
        System.out.println("Missão '" + descricao + "' foi completada!");
    }

    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
    }

    public void setRecompensaExperiencia(int recompensaExperiencia) {
        this.recompensaExperiencia = recompensaExperiencia;
    }

    public String getRecompensaItem() {
        return recompensaItem;
    }

    public void setRecompensaItem(String recompensaItem) {
        this.recompensaItem = recompensaItem;
    }

    @Override
    public String toString() {
        return "Missão: " + descricao + " (Completa: " + completa +
                ", Recompensa: " + recompensaExperiencia + " XP, Item: " + recompensaItem + ")";
    }
}
