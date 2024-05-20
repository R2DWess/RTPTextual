package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mundo {
    private List<Localizacao> localizacoes;
    private Random random;

    public Mundo() {
        this.localizacoes = new ArrayList<>();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("model.Mundo:\n");
        for (Localizacao localizacao : localizacoes) {
            sb.append(localizacao.getNome()).append("\n");
        }
        return sb.toString();
    }
}
