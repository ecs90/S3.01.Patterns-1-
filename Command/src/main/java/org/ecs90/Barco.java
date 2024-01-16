package org.ecs90;

public class Barco extends Vehiculo{
    private boolean estado;
    private int velocimetro;

    @Override
    public void frenar() {
        if (estado) {
            System.out.println("El barco está frenando");
            if (velocimetro <= 0)
                estado = false;
        } else
            System.out.println("El barco está apagado");
    }

    @Override
    public void arrancar() {
        if (!estado) {
            System.out.println("El barco está arrancando");
            velocimetro = 0;
            estado = true;
        } else
            System.out.println("El barco ya está encendido");
    }

    @Override
    public void acelerar() {
        if (estado) {
            System.out.println("El barco está acelerando");
            velocimetro++;
        } else
            System.out.println("El barco está apagado");
    }
}
