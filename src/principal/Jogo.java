import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Mundo mundo;
    private Scanner scanner;

    public Jogo() {
        this.scanner = new Scanner(System.in);
    }

    // Método para iniciar o jogo
    public void iniciar() {
        System.out.println("Bem-vindo ao RPG Textual!");
        System.out.print("Digite o nome do seu personagem: ");
        String nomeDoJogador = scanner.nextLine();
        jogador = new Jogador(nomeDoJogador);

        // Configura o mundo do jogo
        mundo = new Mundo();
        configurarMundo();

        System.out.println("Olá, " + jogador.getNome() + "! Sua aventura começa agora.");
        jogar();
    }

    // Método para jogar o jogo
    public void jogar() {
        while (true) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Explorar");
            System.out.println("2. Ver status");
            System.out.println("3. Ver inventário");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    explorar();
                    break;
                case 2:
                    mostrarStatus();
                    break;
                case 3:
                    jogador.mostrarInventario();
                    break;
                case 4:
                    System.out.println("Obrigado por jogar! Até a próxima.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Método para configurar o mundo do jogo
    private void configurarMundo() {
        // Cria alguns locais e inimigos de exemplo
        Localizacao floresta = new Localizacao("Floresta");
        floresta.adicionarInimigo(new Inimigo("Lobo", 30, 5, 2));
        floresta.adicionarInimigo(new Inimigo("Goblin", 20, 4, 1));

        Localizacao caverna = new Localizacao("Caverna");
        caverna.adicionarInimigo(new Inimigo("Troll", 50, 7, 3));
        caverna.adicionarInimigo(new Inimigo("Morcego Gigante", 25, 6, 1));

        mundo.adicionarLocalizacao(floresta);
        mundo.adicionarLocalizacao(caverna);
    }

    // Método para explorar o mundo
    private void explorar() {
        System.out.println("Você está explorando...");
        // Seleciona um local aleatório para explorar
        Localizacao local = mundo.getLocalizacaoAleatoria();
        System.out.println("Você encontrou: " + local.getNome());

        if (local.getInimigos().isEmpty()) {
            System.out.println("Não há inimigos aqui.");
        } else {
            for (Inimigo inimigo : local.getInimigos()) {
                batalhar(inimigo);
                if (jogador.getVida() <= 0) {
                    System.out.println("Você morreu. Fim de jogo.");
                    return;
                }
            }
        }
    }

    // Método para batalhar contra um inimigo
    private void batalhar(Inimigo inimigo) {
        System.out.println("Você encontrou um " + inimigo.getNome() + "!");

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Atacar");
            System.out.println("2. Fugir");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (escolha == 1) {
                jogador.atacar(inimigo);
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(jogador);
                }
            } else if (escolha == 2) {
                System.out.println("Você fugiu da batalha.");
                return;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        if (jogador.getVida() > 0) {
            System.out.println("Você derrotou o " + inimigo.getNome() + "!");
        } else {
            System.out.println("Você foi derrotado pelo " + inimigo.getNome() + ".");
        }
    }

    // Método para mostrar o status do jogador
    private void mostrarStatus() {
        System.out.println("\nStatus do Jogador:");
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Nível: " + jogador.getNivel());
        System.out.println("Experiência: " + jogador.getExperiencia());
    }
}
