public class Item {
    private String nome;

    // Construtor da classe Item
    public Item(String nome) {
        this.nome = nome;
    }

    // Método getter para o nome do item
    public String getNome() {
        return nome;
    }

    // Método setter para o nome do item
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para representar o item como uma string
    @Override
    public String toString() {
        return nome;
    }
}
