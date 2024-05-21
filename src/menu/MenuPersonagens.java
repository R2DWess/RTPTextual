package menu;

import model.Personagem;
import model.personagens.barbaro.Barbaro;
import model.personagens.barbaro.HabilidadesBarbaro;
import model.personagens.bardo.Bardo;
import model.personagens.bardo.HabilidadesBardo;
import model.personagens.bruxo.Bruxo;
import model.personagens.bruxo.HabilidadesBruxo;
import model.personagens.clerigo.Clerigo;
import model.personagens.clerigo.HabilidadesClerigo;
import model.personagens.druida.Druida;
import model.personagens.druida.HabilidadesDruida;
import model.personagens.feiticeiro.Feiticeiro;
import model.personagens.feiticeiro.HabilidadesFeiticeiro;
import model.personagens.mago.HabilidadesMago;
import model.personagens.mago.Mago;
import model.personagens.ranger.HabilidadesRanger;
import model.personagens.ranger.Ranger;
import model.Arma;

import java.util.Scanner;

public class MenuPersonagens {
    private Scanner scanner;

    public MenuPersonagens() {
        this.scanner = new Scanner(System.in);
    }

    public Personagem criarPersonagem() {
        System.out.println("Escolha o tipo de personagem que você deseja criar:");
        System.out.println("1. Mago");
        System.out.println("2. Bárbaro");
        System.out.println("3. Bardo");
        System.out.println("4. Feiticeiro");
        System.out.println("5. Bruxo");
        System.out.println("6. Druida");
        System.out.println("7. Ranger");
        System.out.println("8. Clérigo");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do seu personagem: ");
        String nomeDoJogador = scanner.nextLine();

        Personagem personagem = null;

        switch (escolha) {
            case 1:
                HabilidadesMago habilidadesMago = new HabilidadesMago(10, 3, 50);
                Arma armaMago = new Arma("Staff", 10);
                personagem = new Mago(nomeDoJogador, 100, habilidadesMago, armaMago);
                break;
            case 2:
                HabilidadesBarbaro habilidadesBarbaro = new HabilidadesBarbaro(15, 5, 10);
                Arma armaBarbaro = new Arma("Axe", 12);
                personagem = new Barbaro(nomeDoJogador, 120, habilidadesBarbaro, armaBarbaro);
                break;
            case 3:
                HabilidadesBardo habilidadesBardo = new HabilidadesBardo(8, 4, 30);
                Arma armaBardo = new Arma("Lute", 8);
                personagem = new Bardo(nomeDoJogador, 90, habilidadesBardo, armaBardo);
                break;
            case 4:
                HabilidadesFeiticeiro habilidadesFeiticeiro = new HabilidadesFeiticeiro(12, 3, 60);
                Arma armaFeiticeiro = new Arma("Wand", 10);
                personagem = new Feiticeiro(nomeDoJogador, 95, habilidadesFeiticeiro, armaFeiticeiro);
                break;
            case 5:
                HabilidadesBruxo habilidadesBruxo = new HabilidadesBruxo(11, 4, 55);
                Arma armaBruxo = new Arma("Scepter", 9);
                personagem = new Bruxo(nomeDoJogador, 100, habilidadesBruxo, armaBruxo);
                break;
            case 6:
                HabilidadesDruida habilidadesDruida = new HabilidadesDruida(10, 5, 45);
                Arma armaDruida = new Arma("Staff", 10);
                personagem = new Druida(nomeDoJogador, 110, habilidadesDruida, armaDruida);
                break;
            case 7:
                HabilidadesRanger habilidadesRanger = new HabilidadesRanger(13, 4, 35);
                Arma armaRanger = new Arma("Bow", 11);
                personagem = new Ranger(nomeDoJogador, 105, habilidadesRanger, armaRanger);
                break;
            case 8:
                HabilidadesClerigo habilidadesClerigo = new HabilidadesClerigo(9, 6, 70);
                Arma armaClerigo = new Arma("Mace", 9);
                personagem = new Clerigo(nomeDoJogador, 115, habilidadesClerigo, armaClerigo);
                break;
            default:
                System.out.println("Opção inválida. Personagem padrão Mago será criado.");
                habilidadesMago = new HabilidadesMago(10, 3, 50);
                armaMago = new Arma("Staff", 10);
                personagem = new Mago(nomeDoJogador, 100, habilidadesMago, armaMago);
                break;
        }

        return personagem;
    }
}
