package org.ecs90;

public class DireccionAR implements iDireccion {
    private String streetAndNumber;
    private String floorSlashApt;
    private String city;
    private int postalCode;

    public DireccionAR(String streetAndNumber, String floorSlashApt, String city, int postalCode) {
        this.streetAndNumber = streetAndNumber;
        this.floorSlashApt = floorSlashApt;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String formatDirection() {
        return streetAndNumber + ", " + floorSlashApt + ", " + postalCode + ", " + city;
    }
}
