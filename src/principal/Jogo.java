package principal;

import model.*;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Mundo mundo;
    private Scanner scanner;

    public Jogo() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao RPG Textual!");
        System.out.print("Digite o nome do seu personagem: ");
        String nomeDoJogador = scanner.nextLine();
        jogador = new Jogador(nomeDoJogador);

        mundo = new Mundo();
        configurarMundo();

        System.out.println("Olá, " + jogador.getNome() + "! Sua aventura começa agora.");
        jogar();
    }

    public void jogar() {
        while (true) {
            limparConsole();
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Explorar");
            System.out.println("2. Ver status");
            System.out.println("3. Ver inventário");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

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

    private void configurarMundo() {
        Localizacao floresta = new Localizacao("Floresta");
        floresta.adicionarInimigo(new Inimigo("Lobo", 30, 10, 2)); // Ajuste o poderDeAtaque para 10
        floresta.adicionarInimigo(new Inimigo("Goblin", 20, 4, 1));

        Localizacao caverna = new Localizacao("Caverna");
        caverna.adicionarInimigo(new Inimigo("Troll", 50, 7, 3));
        caverna.adicionarInimigo(new Inimigo("Morcego Gigante", 25, 6, 1));

        mundo.adicionarLocalizacao(floresta);
        mundo.adicionarLocalizacao(caverna);
    }

    private void explorar() {
        System.out.println("Você está explorando...");

        Item item = gerarItemAleatorio();
        if (item != null) {
            System.out.println("Você encontrou um item: " + item.getNome());
            jogador.adicionarItem(item);
        }

        Localizacao local = mundo.getLocalizacaoAleatoria();
        System.out.println("Você encontrou: " + local.getNome());

        if (local.getInimigos().isEmpty()) {
            System.out.println("Não há inimigos aqui.");
        } else {
            for (Inimigo inimigo : local.getInimigos()) {
                batalhar(inimigo, item);  // Passa o item como argumento
                if (jogador.getVida() <= 0) {
                    System.out.println("Você morreu. Fim de jogo.");
                    return;
                }
            }
        }
    }

    private Item gerarItemAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(100);

        if (numero < 30) {
            return new Arma("Espada", 5);
        } else if (numero < 60) {
            return new Arma("Cajado", 3);
        } else if (numero < 90) {
            return new Arma("Adaga", 4);
        } else {
            return null;
        }
    }

    public void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar o console.");
        }
    }

    private void batalhar(Inimigo inimigo, Item item) {
        System.out.println("Você encontrou um " + inimigo.getNome() + "!");

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Atacar");
            System.out.println("2. Fugir");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                jogador.atacar(inimigo, item);  // Passa o item como argumento
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(jogador, item);  // Passa o item como argumento
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

    private void mostrarStatus() {
        System.out.println("\nStatus do model.Jogador:");
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Nível: " + jogador.getNivel());
        System.out.println("Experiência: " + jogador.getExperiencia());
    }
}