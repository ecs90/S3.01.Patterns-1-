package org.ecs90;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final UndoMenu menu = new UndoMenu();

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 6) {
            menu.printOpciones();
            opcion = input.nextInt();
            input.nextLine();
            menu.optionsSwitch(opcion, input);
        }
    }
}