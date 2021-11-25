package builder.ex2;

public class BikeBuilder implements VehicleBuilder {

    @Override
    public void buildEngine() {
        System.out.println("Bike Engine built...");
    }

    @Override
    public void buildWheels() {
        System.out.println("Bike wheels built...");
    }

    @Override
    public void buildFrame() {
        System.out.println("Bike Frame built...");
    }

    @Override
    public Vehicle getResult() {
        this.buildFrame();
        this.buildEngine();
        this.buildWheels();
        return new Bike();
    }
}
