package METIER;
import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImplement implements IMetier {
    private IDao dao;// Couplage Faible

    @Override
    public double calcul() {
        double d = dao.getData();
        double res =d*13;
        return res;
    }
/*
Pour injecter dans la variable dao
un objet d'une classe qui implémente l'interface IDao
 */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public IMetierImplement(IDao dao) {
        this.dao = dao;
    }
}
