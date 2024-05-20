import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mundo {
    private List<Localizacao> localizacoes;
    private Random random;

    // Construtor da classe Mundo
    public Mundo() {
        this.localizacoes = new ArrayList<>();
        this.random = new Random();
    }

    // Método para adicionar uma localização ao mundo
    public void adicionarLocalizacao(Localizacao localizacao) {
        localizacoes.add(localizacao);
    }

    // Método para obter uma lista de todas as localizações
    public List<Localizacao> getLocalizacoes() {
        return localizacoes;
    }

    // Método para obter uma localização aleatória
    public Localizacao getLocalizacaoAleatoria() {
        if (localizacoes.isEmpty()) {
            return null;
        }
        int index = random.nextInt(localizacoes.size());
        return localizacoes.get(index);
    }

    // Método para representar o mundo como uma string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mundo:\n");
        for (Localizacao localizacao : localizacoes) {
            sb.append(localizacao.getNome()).append("\n");
        }
        return sb.toString();
    }
}
