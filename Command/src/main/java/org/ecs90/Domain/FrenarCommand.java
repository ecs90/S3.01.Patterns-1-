package org.ecs90.Domain;

import org.ecs90.Command.iCommand;

public class FrenarCommand implements iCommand {
    private Vehiculo vehiculo;

    public FrenarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.frenar();
    }
}
