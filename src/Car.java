import java.awt.*;
import java.lang.Math.*;

public abstract class Car implements Movable{
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    private double xCoordinate, yCoordinate;
    private float angle;



    public int getNrDoors() {
        System.out.println(nrDoors);
        return nrDoors;
    }

    public double getEnginePower() {
        System.out.println(enginePower);
        return enginePower;
    }

    public double getCurrentSpeed() {
        if (currentSpeed >= 0 && currentSpeed <= enginePower)
        System.out.println(currentSpeed);
        return currentSpeed;
    }

    public Color getColor() {
        System.out.println(color);
        return color;
    }

    public void move() {
        xCoordinate += currentSpeed;
        yCoordinate += currentSpeed;
    }

    public void turnLeft() {
        angle += Math.PI/2;
        yCoordinate += Math.sin(angle) * currentSpeed;
        xCoordinate += Math.cos(angle) * currentSpeed;
    }

    public void turnRight() {
        angle += Math.PI/-2;
        yCoordinate += Math.sin(angle) * currentSpeed;
        xCoordinate += Math.cos(angle) * currentSpeed;
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

    private void setCurrentSpeed() {

    }

    public double getxCoordinate() {
        System.out.println(xCoordinate);
        return xCoordinate; }

    public double getyCoordinate() {
        System.out.println(yCoordinate);
        return yCoordinate;
    }

    public void gas(double amount) {
        if (amount < 0 || amount > 1){
            throw new IllegalArgumentException("Invalid");
      } else {
        incrementSpeed(amount); }
    }

    public void brake(double amount){
        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException("Invalid");
        } else {
            decrementSpeed(amount); }
    }

    protected abstract double speedFactor();

    private void incrementSpeed(double amount){
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower)); }

    private void decrementSpeed(double amount){
            setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));}
}