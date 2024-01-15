package org.ecs90;

public class TelefonoFactory {
    private int numero;

    public TelefonoFactory(int numero) {
        this.numero = numero;
    }

    public iTelefono getTelefono(String pais, int numero){
        if (pais.isEmpty()) {
            return new Telefono(numero);
        } else if (pais.equalsIgnoreCase("españa")) {
            return new TelefonoES(numero);
        } else if (pais.equalsIgnoreCase("argentina")) {
            return new TelefonoAR(numero);
        } else if (pais.equalsIgnoreCase("japon")) {
            return new TelefonoJPN(numero);
        }
        return null;
    }
}
