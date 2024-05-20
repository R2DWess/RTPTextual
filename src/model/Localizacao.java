import java.util.ArrayList;
import java.util.List;

public class Localizacao {
    private String nome;
    private List<Inimigo> inimigos;

    // Construtor da classe Localizacao
    public Localizacao(String nome) {
        this.nome = nome;
        this.inimigos = new ArrayList<>();
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    // Método para adicionar um inimigo ao local
    public void adicionarInimigo(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    // Método para remover um inimigo do local
    public void removerInimigo(Inimigo inimigo) {
        inimigos.remove(inimigo);
    }

    // Método para verificar se há inimigos no local
    public boolean temInimigos() {
        return !inimigos.isEmpty();
    }
}
