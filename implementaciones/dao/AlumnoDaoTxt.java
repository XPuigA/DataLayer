package implementaciones.dao;

import interfaces.IGuardar;
import interfaces.ILeer;

public class AlumnoDaoTxt extends AbstractAlumnoDao {

    public AlumnoDaoTxt(IGuardar guardarImpl, ILeer leerImpl) {
        super(guardarImpl, leerImpl);
    }

    @Override
    public void guardar() {
        guardarImpl.ejecutar();
    }

    @Override
    public void leer() {
        leerImpl.ejecutar();
    }
}
