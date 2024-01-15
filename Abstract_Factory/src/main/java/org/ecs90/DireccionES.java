package org.ecs90;

public class DireccionES implements iDireccion {
    private String street;
    private String numberAndApt;
    private int postalCode;
    private String city;

    public DireccionES(String street, String numberAndApt, int postalCode, String city) {
        this.street = street;
        this.numberAndApt = numberAndApt;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String formatDirection() {
        return street + ", " + numberAndApt + ", " + postalCode + ", " + city;
    }
}
