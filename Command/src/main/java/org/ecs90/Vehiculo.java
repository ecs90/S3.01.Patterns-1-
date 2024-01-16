package org.ecs90;

public class Vehiculo {
    private boolean estado;
    private int velocimetro;
    private String tipo;

    public void frenar() {
        if (estado) {
            System.out.println("El avion está frenando");
            if (velocimetro <= 0)
                estado = false;
        } else
            System.out.println("El avión está apagado");
    }

    public void arrancar() {
        if (!estado) {
            System.out.println("El avion está arrancando");
            velocimetro = 0;
            estado = true;
        } else
            System.out.println("El avión ya está encendido");
    }

    public void acelerar() {
        if (estado) {
            System.out.println("El avión está acelerando");
            velocimetro++;
        } else
            System.out.println("El avión está apagado");
    }
}
