package org.ecs90;

import org.ecs90.Command.AcelerarCommand;
import org.ecs90.Command.ArrancarCommand;
import org.ecs90.Command.iCommand;
import org.ecs90.Domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parking {
    private List<iCommand> commands;

    private Vehiculo vehiculo;

    public Parking(Vehiculo veiculo) {
        this.vehiculo = veiculo;
        this.commands = new ArrayList<iCommand>(Arrays.asList(
                new ArrancarCommand(vehiculo), new AcelerarCommand(vehiculo),
                new FrenarCommand(vehiculo)));
    }

    public List<iCommand> getCommands() {
        return commands;
    }
}
