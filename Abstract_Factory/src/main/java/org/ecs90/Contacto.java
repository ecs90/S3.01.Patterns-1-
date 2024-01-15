package org.ecs90;

public class Contacto implements AbstractFactory {
    private iDireccion direccion;
    private iTelefono telefono;

    public Contacto(iDireccion direccion, iTelefono telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public iTelefono getTelefono(int numero, String pais) {
        return new TelefonoFactory(numero).getTelefono(pais, numero);
    }

    @Override
    public iDireccion getDireccion(String number, String street, String aptNumber, String postalCode,
                                   String city, String town, String pais) {
        return new DireccionFactory(number, street, aptNumber, postalCode, city, town).getDireccion(pais);
    }
}
