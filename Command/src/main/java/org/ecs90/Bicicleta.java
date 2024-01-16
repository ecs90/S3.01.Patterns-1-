package org.ecs90;

public class Bicicleta extends Vehiculo{
    private boolean estado;
    @Override
    public void frenar() {
        if (estado)
            System.out.println("El avion está frenando");
        else
            System.out.println("El avión está apagado");
    }

    @Override
    public void arrancar() {
        if (!estado) {
            System.out.println("El avion está arrancando");
            estado = true;
        } else
            System.out.println("El avión ya está encendido");
    }

    @Override
    public void acelerar() {
        if (estado)
            System.out.println("El avión está acelerando");
        else
            System.out.println("El avión está apagado");
    }
}
