import java.awt.*;

public abstract class Cars {
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name


    public int getNrDoors() {
        System.out.println(nrDoors);
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        System.out.println(currentSpeed);
        return currentSpeed;
    }

    public Color getColor() {
        System.out.println(color);
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }



    public abstract void incrementSpeed(double amount); {}

}