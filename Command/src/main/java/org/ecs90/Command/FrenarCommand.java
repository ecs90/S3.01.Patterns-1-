package org.ecs90.Command;

import org.ecs90.Command.iCommand;
import org.ecs90.Domain.Vehiculo;

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
