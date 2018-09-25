package implementaciones.crud;

import interfaces.ILeer;

public class LeerDB1 implements ILeer {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando LeerDB1");
    }
}
