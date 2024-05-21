package menu;

import java.util.Scanner;

public class MenuInimigo {
    private Scanner scanner;

    public MenuInimigo() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenuBatalha() {
        System.out.println("\nO que você gostaria de fazer?");
        System.out.println("1. Atacar");
        System.out.println("2. Fugir");

        return scanner.nextInt();
    }
}