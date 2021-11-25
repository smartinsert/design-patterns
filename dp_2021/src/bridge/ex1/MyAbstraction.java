package bridge.ex1;

public abstract class MyAbstraction {
     Dao dao;

    public MyAbstraction(Dao dao) {
        this.dao = dao;
    }

    public abstract String registerEmp(int id);
}
