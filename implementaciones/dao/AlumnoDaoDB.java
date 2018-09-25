package implementaciones.dao;

import interfaces.IGuardar;
import interfaces.ILeer;

public class AlumnoDaoDB extends AbstractAlumnoDao {

    public AlumnoDaoDB(IGuardar guardarImpl, ILeer leerImpl) {
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
