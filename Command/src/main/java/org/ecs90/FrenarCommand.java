package org.ecs90;

public class FrenarCommand implements iVehiculo{
    private Vehiculo vehiculo;

    public FrenarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.frenar();
    }
}
