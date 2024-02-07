package org.ecs90.Command;

import org.ecs90.Domain.Vehiculo;

public class AcelerarCommand implements iCommand {
    private Vehiculo vehiculo;

    public AcelerarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.acelerar();
    }
}
