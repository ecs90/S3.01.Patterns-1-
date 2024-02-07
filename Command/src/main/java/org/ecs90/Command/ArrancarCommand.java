package org.ecs90.Command;

import org.ecs90.Domain.Vehiculo;

public class ArrancarCommand implements iCommand {
    private Vehiculo vehiculo;

    public ArrancarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.arrancar();
    }
}
