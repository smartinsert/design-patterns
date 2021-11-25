package bridge.ex1;

public class DaoImplB implements Dao {
    @Override
    public String save(int id) {
        return "Emp Saved with Dao-B with id " + id;
    }
}
