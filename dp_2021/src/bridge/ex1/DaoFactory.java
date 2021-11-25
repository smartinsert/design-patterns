package bridge.ex1;

public class DaoFactory {
    public static Dao getDao(String daoType){
        if(daoType.equals("a")){
            return new DaoImplA();
        }else if(daoType.equals("b")){
            return new DaoImplB();
        }else{
            throw new RuntimeException("Dao not supported..");
        }
    }
}
