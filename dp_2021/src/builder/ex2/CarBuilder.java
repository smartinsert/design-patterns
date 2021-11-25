package builder.ex2;

public class CarBuilder implements VehicleBuilder {

    @Override
    public void buildEngine() {
        System.out.println("Car Engine built...");
    }

    @Override
    public void buildWheels() {
        System.out.println("Car wheels built...");
    }

    @Override
    public void buildFrame() {
        System.out.println("Car Frame built...");
    }

    @Override
    public Vehicle getResult() {
        this.buildFrame();
        this.buildEngine();
        this.buildWheels();
        return new Car();
    }
}
