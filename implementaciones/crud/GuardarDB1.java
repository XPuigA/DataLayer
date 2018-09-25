package implementaciones.crud;

import interfaces.IGuardar;

public class GuardarDB1 implements IGuardar {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando GuardarDB1");
    }
}
