package org.ecs90;

public class TelefonoES implements iTelefono{
    private int numero;

    public TelefonoES(int numero) {
        this.numero = addPrefix();
    }

    @Override
    public int addPrefix() {
        String prefix = "+34";
        return Integer.parseInt(prefix + String.valueOf(numero));
    }
}
