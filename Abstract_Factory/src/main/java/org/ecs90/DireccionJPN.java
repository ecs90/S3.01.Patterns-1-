package org.ecs90;

public class DireccionJPN implements iDireccion {
    private String postalCode;
    private String prefectura;
    private String municipioAndTown;
    private String houseNumber;
    /*Estos datos se incluyen normalmente en las direcciones japonesas,
    pero para unificar con respecto a otros lugares los quito y de paso simplifico*/
    //private String district;
    //private String barrio;
    //private String houseName;

    public DireccionJPN(String postalCode, String prefectura, String municipioAndTown, String houseNumber) {
        this.postalCode = postalCode;
        this.prefectura = prefectura;
        this.municipioAndTown = municipioAndTown;
        this.houseNumber = houseNumber;
    }

    @Override
    public String formatDirection() {
        return postalCode + " " + prefectura + " " + municipioAndTown + " " + houseNumber;
    }
}
