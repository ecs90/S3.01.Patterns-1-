package org.ecs90.Controller;

import org.ecs90.Command.iCommand;
import org.ecs90.Domain.Avion;
import org.ecs90.Domain.Barco;
import org.ecs90.Domain.Bicicleta;
import org.ecs90.Domain.Coche;
import org.ecs90.Parking;

import java.util.Collections;
import java.util.List;

public class MenuParking {
    private final static String opcionesVehiculo = "De que tipo de vehículo quiere disponer?\n" +
            "1- Avión\n2- Barco\n3- Bicicleta\n4- Coche\n5- Ninguno, salir";
    private final static String opcionesCommand = "Que le gustaría hacer con el vehículo?\n1- Arrancar\n2- Acelerar\n3- Frenar\n" +
            "4- Cambiar de coche\n5- Nada, salir";

    public void printOpcionesVehiculo() {
        System.out.println(opcionesVehiculo);
    }

    public void printOpcionesCommando() {
        System.out.println(opcionesCommand);
    }

    public List<iCommand> switchVehiculo(int opcion) {
        List<iCommand> lista = null;
        Parking parking = null;
        switch(opcion){
            case 1 :
                parking = new Parking(new Avion("Avión"));
                break;
            case 2 :
                parking = new Parking(new Barco("Barco"));
                break;
            case 3:
                parking = new Parking(new Bicicleta("Bicicleta"));
                break;
            case 4:
                parking = new Parking(new Coche("Coche"));
                break;
            case 5:
                System.out.println("Has elegido salir del programa.");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        if (opcion < 5){
            try{
                lista = parking.getCommands();
            } catch (NullPointerException e){
                System.out.println("Algo salió mal, volver a intentar");
            }
        }else {
            lista = Collections.emptyList();
        }
        return lista;
    }

    public void switchCommand(List<iCommand> lista, int opcion){
        switch(opcion){
            case 1 :
                lista.get(0).execute();
                break;
            case 2 :
                lista.get(1).execute();
                break;
            case 3:
                lista.get(2).execute();
                break;
            case 4:
                System.out.println("Has elegido cambiar de vehículo");
                break;
            case 5:
                System.out.println("Has elegido salir del programa.");
                //  No usar, mala practica
                // System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
