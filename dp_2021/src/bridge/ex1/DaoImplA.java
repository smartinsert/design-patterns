package bridge.ex1;

public class DaoImplA implements Dao{
    @Override
    public String save(int id) {
        return "EMp Saved with Dao-A with id "+id;
    }
}
