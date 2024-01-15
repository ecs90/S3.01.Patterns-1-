package org.ecs90;

import java.util.Scanner;

public class DireccionFactory {
    private String number;
    private String street;
    private String aptNumber;
    private String postalCode;
    private String city;
    private String town;

    public DireccionFactory(String number, String street, String aptNumber, String postalCode, String city, String town) {
        this.number = number;
        this.street = street;
        this.aptNumber = aptNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.town = town;
    }

    public iDireccion getDireccion(String pais) {
        if (pais.isEmpty()) {
            String numberAndStreet = number + " " + street;
            String place = town + ", " + city;
            return new Direccion(numberAndStreet, aptNumber, place, Integer.parseInt(postalCode));

        } else if (pais.equalsIgnoreCase("españa")) {
            String numberAndApt = number + " " + aptNumber;
            return new DireccionES(street, numberAndApt, Integer.parseInt(postalCode), city);

        } else if (pais.equalsIgnoreCase("argentina")) {
            String streetAndNumber = street + " " + number;
            return new DireccionAR(streetAndNumber, aptNumber, city, Integer.parseInt(postalCode));

        } else if (pais.equalsIgnoreCase("japon")) {
            return new DireccionJPN(postalCode, city, town, number);
        }
        return null;
    }
}
