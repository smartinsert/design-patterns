package builder.ex2;

public class VehicleShop {
    public Vehicle construct(VehicleBuilder builder){
             return builder.getResult();
    }
}
