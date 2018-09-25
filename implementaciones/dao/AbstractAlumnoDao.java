package implementaciones.dao;

import interfaces.AlumnoDao;
import interfaces.IGuardar;
import interfaces.ILeer;

public abstract class AbstractAlumnoDao implements AlumnoDao {

    IGuardar guardarImpl;
    ILeer leerImpl;

    public AbstractAlumnoDao(IGuardar guardarImpl, ILeer leerImpl) {
        this.guardarImpl = guardarImpl;
        this.leerImpl = leerImpl;
    }

    public void setGuardarImpl(IGuardar guardarImpl) {
        this.guardarImpl = guardarImpl;
    }

    public void setLeerImpl(ILeer leerImpl) {
        this.leerImpl = leerImpl;
    }
}
