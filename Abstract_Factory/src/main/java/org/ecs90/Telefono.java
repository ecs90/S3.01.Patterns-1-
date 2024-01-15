package org.ecs90;

public class Telefono implements iTelefono {
    private int numero;

    public Telefono(int numero) {
        this.numero = numero;
    }

    @Override
    public int addPrefix() {
        return numero;
    }
}
