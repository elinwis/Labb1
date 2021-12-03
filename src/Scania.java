import java.awt.*;
class Scania extends Truck {

    public double anglePlatform;
    private double platformPosition;

    public Scania() {
        super(2, 150, Color.gray, "Scania");
    }

    protected double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public void platformAngleNotZero() {

    }

    @Override
    public void raisePlatform(double radian) {
        if (getCurrentSpeed() == 0) {
            if (anglePlatform > 0 && anglePlatform <= 7 * Math.PI / 18) {
                anglePlatform = Math.min(anglePlatform + radian, 7 * Math.PI / 18);
            }
        } else {
            throw new IllegalArgumentException("Cannot raise platform while moving");
        }
    }

    @Override
    public void lowerPlatform(double radian) {
        if (getCurrentSpeed() == 0) {
            if (anglePlatform > 0 && anglePlatform <= 7 * Math.PI / 18) {
                anglePlatform = Math.max(anglePlatform - radian, 7 * Math.PI / 18);
            }
        } else {
            throw new IllegalArgumentException("Cannot lower platform while moving");
        }
    }


    @Override
    public void gas(double amount) {
        if (anglePlatform == 0) {
            if (amount < 0 || amount > 1) {
                throw new IllegalArgumentException("Illegal input");
            } else {
                incrementSpeed(amount);
            }
        } else {
            throw new IllegalArgumentException("Platform must be fully lowered if moving");
        }
    }

}