package org.ecs90;

public class TelefonoJPN implements iTelefono {
    private int numero;

    public TelefonoJPN(int numero) {
        this.numero = addPrefix();
    }

    @Override
    public int addPrefix() {
        String prefix = "+81";
        return Integer.parseInt(prefix + String.valueOf(numero));
    }
}
