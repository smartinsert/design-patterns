package builder.ex2;

public interface VehicleBuilder {

    void buildEngine();
    void buildWheels();
    void buildFrame();
    Vehicle getResult();
}
