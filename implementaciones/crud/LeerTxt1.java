package implementaciones.crud;

import interfaces.ILeer;

public class LeerTxt1 implements ILeer {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando LeerTxt1");
    }
}
