public class Missao {
    private String descricao;
    private boolean completa;

    // Construtor da classe Missao
    public Missao(String descricao) {
        this.descricao = descricao;
        this.completa = false;
    }

    // Método getter para a descrição da missão
    public String getDescricao() {
        return descricao;
    }

    // Método setter para a descrição da missão
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para verificar se a missão está completa
    public boolean isCompleta() {
        return completa;
    }

    // Método para marcar a missão como completa
    public void completar() {
        this.completa = true;
    }

    // Método para representar a missão como uma string
    @Override
    public String toString() {
        return "Missão: " + descricao + " (Completa: " + completa + ")";
    }
}
