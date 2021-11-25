package factory;

abstract public class CycleFactory {

    public static Cycle createCycle(String cycleType) throws Exception{
        /*if (cycleType.equals("uniCycle")){
            return new UniCycle();
        }else if(cycleType.equals("biCycle")){
            return new BiCycle();
        }else if(cycleType.equals("triCycle")){
            return new TriCycle();
        }else{
            return null;
        }*/

        return (Cycle)Class.forName("factory.TriCycle").newInstance();

        //cycleType=factory.TriCycle

    }
}
