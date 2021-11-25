package factory;

public class AppMain2 {
    public static void main(String[] args) throws Exception{
        ICycleFactory fact=new CycleFactoryImpl();
        Cycle cycle=fact.createCycle("uniCycle");
        cycle.getCycleDetails();
    }
}
