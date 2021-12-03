import java.awt.*;

public abstract class Truck extends Vehicle {

    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    protected abstract void raisePlatform(double radian);
    protected abstract void lowerPlatform(double radian);
}
