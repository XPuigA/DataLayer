package implementaciones.crud;

import interfaces.IGuardar;

public class GuardarTxt1 implements IGuardar {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando GuardarTxt1");
    }
}
