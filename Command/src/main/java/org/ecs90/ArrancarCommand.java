package org.ecs90;

public class ArrancarCommand implements iVehiculo{
    private Vehiculo vehiculo;

    public ArrancarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.arrancar();
    }
}
