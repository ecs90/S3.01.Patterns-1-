package org.ecs90;

import java.util.Scanner;

public class UndoMenu{
    private static final String opciones =
            "Introduce una opción:\n" +
            "1. Añadir comando\n" +
            "2. Mostrar último comando\n" +
            "3. Listar comandos\n" +
            "4. Eliminar último comando\n" +
            "5. Eliminar comando específico\n" +
            "6. Salir";

    private static final Undo undo = Undo.getInstance();

    private static UndoMenu instancia;

    public static UndoMenu getInstance(){
        if (instancia == null)
            instancia = new UndoMenu();
        return instancia;
    }

    public void printOpciones() {
        System.out.println(opciones);
    }

    public void optionsSwitch(int opcion, Scanner input) {
        String comando = "";
        switch(opcion){
            case 1 :
                System.out.println("Introduce el comando a insertar: ");
                comando = input.nextLine();
                System.out.println("Comando insertado!");
                undo.addComandos(comando);
                break;
            case 2 :
                if (!undo.getComandos().isEmpty()) {
                    System.out.println("El último comando insertado es: ");
                    System.out.println(undo.getLastComando());
                } else
                    System.out.println("Aún no hay comandos!");
                break;
            case 3:
                if (undo.getComandos().isEmpty())
                    System.out.println("No hay comandos ingresados");
                undo.printComandos();
                break;
            case 4:
                System.out.println("Último comando borrado!");
                undo.deleteLastComando();
                break;
            case 5:
                System.out.println("Introduce el comando a borrar: ");
                comando = input.nextLine();
                if (undo.getComandos().contains(comando))
                    System.out.println("Comando borrado!");
                else
                    System.out.println("Comando no existente");
                undo.deleteSpecificComando(comando);
            case 6:
                System.out.println("Has elegido salir del programa.");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
