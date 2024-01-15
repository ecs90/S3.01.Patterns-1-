package org.ecs90;

public interface AbstractFactory {
    iTelefono getTelefono(int numero, String pais);
    iDireccion getDireccion(String number, String street, String aptNumber, String postalCode,
                            String city, String town, String pais);
}
