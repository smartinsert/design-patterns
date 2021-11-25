package factory;

public class AppMain {
    public static void main(String[] args) throws Exception{
        Cycle cycle=CycleFactory.createCycle("uniCycle");
        cycle.getCycleDetails();
    }
}
