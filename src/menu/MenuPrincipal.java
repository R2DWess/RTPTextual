package menu;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;

    public MenuPrincipal() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenuPrincipal() {
        System.out.println("\nO que você gostaria de fazer?");
        System.out.println("1. Explorar");
        System.out.println("2. Ver status");
        System.out.println("3. Ver inventário");
        System.out.println("4. Sair");

        return scanner.nextInt();
    }
}