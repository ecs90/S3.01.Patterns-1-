package org.ecs90;

public class AcelerarCommand implements iVehiculo{
    private Vehiculo vehiculo;

    public AcelerarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.acelerar();
    }
}
