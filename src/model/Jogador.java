import java.util.ArrayList;
import java.util.List;

public class Jogador extends Personagem {
    private int experiencia;
    private int nivel;
    private List<Item> inventario;

    // Construtor da classe Jogador
    public Jogador(String nome) {
        super(nome, 100, 10, 5);  // Inicializa os atributos da superclasse Personagem
        this.experiencia = 0;
        this.nivel = 1;
        this.inventario = new ArrayList<>();
    }

    // Métodos getters e setters
    public int getExperiencia() {
        return experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    // Método para aumentar o nível do jogador
    public void aumentarNivel() {
        nivel++;
        setVida(getVida() + 10);
        setPoderDeAtaque(getPoderDeAtaque() + 2);
        setDefesa(getDefesa() + 1);
        System.out.println(getNome() + " subiu para o nível " + nivel + "!");
    }

    // Método para adicionar um item ao inventário
    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    // Método para obter o inventário
    public List<Item> getInventario() {
        return inventario;
    }

    // Método para mostrar o inventário
    public void mostrarInventario() {
        System.out.println("Inventário:");
        for (Item item : inventario) {
            System.out.println(item);
        }
    }
}
