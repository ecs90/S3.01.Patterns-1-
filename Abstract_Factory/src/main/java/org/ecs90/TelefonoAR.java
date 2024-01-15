package org.ecs90;

public class TelefonoAR implements iTelefono{
    private int numero;

    public TelefonoAR(int numero) {
        this.numero = addPrefix();
    }

    @Override
    public int addPrefix() {
        String prefix = "+54";
        return Integer.parseInt(prefix + String.valueOf(numero));
    }
}
