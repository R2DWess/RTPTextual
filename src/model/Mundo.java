package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mundo {
    private List<Localizacao> localizacoes;
    private List<Missao> missoes;
    private Random random;

    public Mundo() {
        this.localizacoes = new ArrayList<>();
        this.missoes = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionarLocalizacao(Localizacao localizacao) {
        localizacoes.add(localizacao);
    }

    public List<Localizacao> getLocalizacoes() {
        return localizacoes;
    }

    public Localizacao getLocalizacaoAleatoria() {
        if (localizacoes.isEmpty()) {
            return null;
        }
        int index = random.nextInt(localizacoes.size());
        return localizacoes.get(index);
    }

    public void adicionarMissao(Missao missao) {
        missoes.add(missao);
    }

    public List<Missao> getMissoes() {
        return missoes;
    }

    public void mostrarLocalizacoes() {
        if (localizacoes.isEmpty()) {
            System.out.println("Não há localizações no mundo.");
        } else {
            System.out.println("Localizações no mundo:");
            for (Localizacao localizacao : localizacoes) {
                System.out.println("- " + localizacao);
            }
        }
    }

    public void mostrarMissoes() {
        if (missoes.isEmpty()) {
            System.out.println("Não há missões disponíveis.");
        } else {
            System.out.println("Missões disponíveis:");
            for (Missao missao : missoes) {
                System.out.println("- " + missao);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mundo:\nLocalizações:\n");
        for (Localizacao localizacao : localizacoes) {
            sb.append(localizacao).append("\n");
        }
        sb.append("Missões:\n");
        for (Missao missao : missoes) {
            sb.append(missao).append("\n");
        }
        return sb.toString();
    }
}
