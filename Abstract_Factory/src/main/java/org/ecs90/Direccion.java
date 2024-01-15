package org.ecs90;

public class Direccion implements iDireccion{
    private String numberAndStreet;
    private String aptNumber;
    private String place;
    private int postalCode;

    public Direccion(String numberAndStreet, String aptNumber, String place, int postalCode) {
        this.numberAndStreet = numberAndStreet;
        this.aptNumber = aptNumber;
        this.place = place;
        this.postalCode = postalCode;
    }

    @Override
    public String formatDirection() {
        return numberAndStreet + "\n" + aptNumber + "\n" + place + "\n" + postalCode;
    }
}
