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

    public void printOpciones() {
        System.out.println(opciones);
    }

    public void optionsSwitch(int opcion, Scanner input) {
        String comando = "";
        switch(opcion){
            case 1 :
                addComando(comando, input);
                break;
            case 2 :
                showLast();
                break;
            case 3:
                showAll();
                break;
            case 4:
                deleteLast();
                break;
            case 5:
                deleteOne(comando, input);
                break;
            case 6:
                System.out.println("Has elegido salir del programa.");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private void addComando(String comando, Scanner input){
        System.out.println("Introduce el comando a insertar: ");
        comando = input.nextLine();
        System.out.println("Comando insertado!");
        undo.addComandos(comando);
    }

    private void showLast() {
        if (!undo.getComandos().isEmpty()) {
            System.out.println("El último comando insertado es: ");
            System.out.println(undo.getLastComando());
        } else
            System.out.println("Aún no hay comandos!");
    }

    private void showAll() {
        if (undo.getComandos().isEmpty())
            System.out.println("No hay comandos ingresados");
        undo.printComandos();
    }

    private void deleteLast() {
        System.out.println("Último comando borrado!");
        undo.deleteLastComando();
    }

    private void deleteOne(String comando, Scanner input) {
        System.out.println("Introduce el comando a borrar: ");
        comando = input.nextLine();
        if (undo.getComandos().contains(comando))
            System.out.println("Comando borrado!");
        else
            System.out.println("Comando no existente");
        undo.deleteSpecificComando(comando);
    }
}
