package factory;

public class CycleFactoryImpl implements ICycleFactory {
    @Override
    public Cycle createCycle(String cycleType) {
        if (cycleType.equals("uniCycle")) {
            return new UniCycle();
        } else if (cycleType.equals("biCycle")) {
            return new BiCycle();
        } else if (cycleType.equals("triCycle")) {
            return new TriCycle();
        } else {
            return null;
        }
    }
}
