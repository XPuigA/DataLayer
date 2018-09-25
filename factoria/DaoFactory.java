package factoria;

import implementaciones.crud.GuardarDB1;
import implementaciones.crud.GuardarTxt1;
import implementaciones.crud.LeerDB2;
import implementaciones.crud.LeerTxt2;
import implementaciones.dao.AlumnoDaoDB;
import implementaciones.dao.AlumnoDaoTxt;
import interfaces.AlumnoDao;

public class DaoFactory {

    private static DaoFactory instance = new DaoFactory();
    private static AlumnoDaoDB alumnoDaoDB;
    private static AlumnoDaoTxt alumnoDaoTxt;

    private DaoFactory() {
        alumnoDaoDB = new AlumnoDaoDB(new GuardarDB1(),new LeerDB2());
        alumnoDaoTxt = new AlumnoDaoTxt(new GuardarTxt1(),new LeerTxt2());
    }

    public AlumnoDao getDao(TipoDao tipoDao) {
        switch (tipoDao) {
            case DB:
                return alumnoDaoDB;
            default:
                return alumnoDaoTxt;
        }
    }

    public static DaoFactory getInstance() {
        return instance;
    }
}
