package builder.ex2;

public class BuilderApp {
    public static void main(String[] args) {
        VehicleShop director=new VehicleShop();
        VehicleBuilder carBuilder = new CarBuilder();
        director.construct(carBuilder);


        VehicleBuilder bikeBuilder = new BikeBuilder();
        director.construct(bikeBuilder);
    }
}
