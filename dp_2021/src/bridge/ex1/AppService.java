package bridge.ex1;

public class AppService extends MyAbstraction {
  //  private Dao dao;

    public AppService(Dao dao) {
        super(dao);
    }

    @Override
    public String registerEmp(int id) {
        String resp = dao.save(id);
        return resp;
    }
}
