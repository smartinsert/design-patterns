package bridge.ex1;

public class BridgeMainApp {
    public static void main(String[] args) {
        //Dao dao=new DaoImplB();
       Dao dao=DaoFactory.getDao("b");
        MyAbstraction service= new AppService(dao);

       System.out.println(service.registerEmp(100));
    }
}
