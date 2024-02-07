package org.ecs90.Domain;

public class Vehiculo {
    private boolean estado;
    private int velocimetro;
    private String tipo;

    public Vehiculo(String tipo) {
        this.estado = false;
        this.velocimetro = 0;
        this.tipo = tipo;
    }

    public void frenar() {
        if (estado) {
            System.out.println("El vehiculo (" + tipo + ") está frenando");
            velocimetro--;
            if (velocimetro <= 0) {
                System.out.println("El vehiculo (" + tipo + ") se ha detenido");
                estado = false;
            }
        } else
            System.out.println("El vehículo (" + tipo + ") está apagado");
    }

    public void arrancar() {
        if (!estado) {
            System.out.println("El vehículo (" + tipo + ") está arrancando");
            velocimetro = 0;
            estado = true;
        } else
            System.out.println("El vehículo (" + tipo + ") ya está encendido");
    }

    public void acelerar() {
        if (estado) {
            System.out.println("El vehículo (" + tipo + ") está acelerando");
            velocimetro++;
        } else
            System.out.println("El vehículo (" + tipo + ") está apagado");
    }
}
