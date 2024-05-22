package principal;

import model.*;
import menu.MenuPersonagens;

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
        MenuPersonagens menuPersonagens = new MenuPersonagens();
        jogador = (Jogador) menuPersonagens.criarPersonagem();

        mundo = new Mundo();
        configurarMundo();
        System.out.println("Olá, " + jogador.getNome() + "! Sua aventura começa agora.");
        jogar();
    }

    public void jogar() {
        while (true) {
            int escolha = exibirMenuPrincipal();

            switch (escolha) {
                case 1:
                    explorar();
                    break;
                case 2:
                    System.out.println(jogador);
                    break;
                case 3:
                    jogador.mostrarInventario();
                    break;
                case 4:
                    mostrarMissoes();
                    break;
                case 5:
                    System.out.println("Obrigado por jogar! Até a próxima.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private int exibirMenuPrincipal() {
        System.out.println("\nO que você gostaria de fazer?");
        System.out.println("1. Explorar");
        System.out.println("2. Ver status");
        System.out.println("3. Ver inventário");
        System.out.println("4. Ver missões");
        System.out.println("5. Sair");

        return scanner.nextInt();
    }

    private void explorar() {
        Localizacao local = mundo.getLocalizacaoAleatoria();
        if (local == null) {
            System.out.println("Não há localizações disponíveis para explorar.");
            return;
        }
        System.out.println("Você explora a localização: " + local.getNome());

        if (local.getInimigos().isEmpty()) {
            System.out.println("Não há inimigos aqui.");
        } else {
            Inimigo inimigo = local.getInimigos().get(0);
            System.out.println("Você encontrou um " + inimigo.getNome() + "!");
            batalhar(inimigo);
        }
    }

    private void batalhar(Inimigo inimigo) {
        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            System.out.println("\nSua vida: " + jogador.getVida());
            System.out.println("Vida do " + inimigo.getNome() + ": " + inimigo.getVida());

            System.out.println("Escolha uma ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Fugir");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                Item armaJogador = jogador.getInventario().isEmpty() ? new Arma("Punhos", 0) : jogador.getInventario().get(0);
                jogador.atacar(inimigo, armaJogador);
                if (inimigo.getVida() > 0) {
                    Item armaInimigo = inimigo.getInventario().isEmpty() ? new Arma("Garras", 0) : inimigo.getInventario().get(0);
                    inimigo.atacar(jogador, armaInimigo);
                }
            } else if (escolha == 2) {
                System.out.println("Você fugiu da batalha!");
                return;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        if (jogador.getVida() > 0) {
            System.out.println("Você derrotou o " + inimigo.getNome() + "!");
            String nome = inimigo.getNome();
            if(nome == "Goblin"){
                mundo.finalizaMissao(0);
            } else if(nome == "Troll"){
                mundo.finalizaMissao(1);
            }
        } else {
            System.out.println("Você foi derrotado pelo " + inimigo.getNome() + "...");
            System.exit(0);
        }
    }

    private void mostrarMissoes() {
        mundo.mostrarMissoes();
    }

    private void configurarMundo() {
        Localizacao floresta = new Localizacao("Floresta", "Uma floresta densa e misteriosa.");
        Localizacao caverna = new Localizacao("Caverna", "Uma caverna escura e úmida.");

        Inimigo goblin = new Inimigo("Goblin", 30, 5, 2);
        goblin.adicionarItem(new Arma("Adaga enferrujada", 2));
        Inimigo troll = new Inimigo("Troll", 50, 8, 5);
        troll.adicionarItem(new Arma("Clava", 3));

        floresta.adicionarInimigo(goblin);
        caverna.adicionarInimigo(troll);

        mundo.adicionarLocalizacao(floresta);
        mundo.adicionarLocalizacao(caverna);

        Missao missao1 = new Missao("Derrote o Goblin na Floresta", 50, "Poção de Cura");
        Missao missao2 = new Missao("Derrote o Troll na Caverna", 100, "Elmo de Ferro");

        mundo.adicionarMissao(missao1);
        mundo.adicionarMissao(missao2);
    }
}
