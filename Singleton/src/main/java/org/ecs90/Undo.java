package org.ecs90;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instancia;
    private List<String> comandos;

    private Undo(){
        this.comandos = new ArrayList<>();
    }

    public static Undo getInstance(){
        if (instancia == null)
            instancia = new Undo();
        return instancia;
    }

    public void addComandos(String comando) {
        this.comandos.add(comando);
    }

    public String getLastComando() {
        return comandos.get(comandos.size() - 1);
    }

    public void printComandos() {
        for (String comando : comandos) {
            System.out.println(comando);
        }
    }

    public void deleteLastComando() {
        if (comandos.size() > 0) {
            comandos.remove(comandos.size() - 1);
        }
    }

    public void deleteSpecificComando(String comando) {
        comandos.remove(comando);
    }

    public List<String> getComandos() {
        return comandos;
    }
}
