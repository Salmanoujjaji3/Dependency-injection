package ext;

import DAO.IDao;

public class DaoImplementV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        double d = 66;
        return d;
    }
}
