package org.ecs90;

import org.ecs90.Command.iCommand;
import org.ecs90.Controller.MenuParking;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final MenuParking menu = new MenuParking();
    public static void main(String[] args) {
        int opcion = 0;
        List<iCommand> lista = null;

        while (opcion != 5) {
            menu.printOpcionesVehiculo();
            opcion = input.nextInt();
            input.nextLine();
            lista = menu.switchVehiculo(opcion);
            while (opcion != 5 && opcion != 4) {
                menu.printOpcionesCommando();
                opcion = input.nextInt();
                input.nextLine();
                menu.switchCommand(lista, opcion);
            }
        }
    }
}