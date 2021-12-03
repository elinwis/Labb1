import java.awt.*;
import java.util.Stack;

public class CarTransport extends Truck{

    private boolean isPlatformDown;
    private double distanceCarToTransport;
    private boolean isCarAlreadyLoaded;

    public CarTransport() {
        super(2, 150, Color.yellow, "CarTransport");
        isPlatformDown = false;
    }

    Stack <Car> stk = new Stack<>();

    @Override
    protected double speedFactor() {
        return getEnginePower() * 0.01;
    }

    @Override
    protected void raisePlatform(double radian) {
        isPlatformDown = getCurrentSpeed() != 0;
    }

    @Override
    protected void lowerPlatform(double radian) {
        isPlatformDown = getCurrentSpeed() == 0;
    }

    private void loadCars(Car car) {
        if (stk.size() < 10)
            if (isPlatformDown && 0 < distanceCarToTransport && distanceCarToTransport <= 1 && !isCarAlreadyLoaded) {
            stk.push(car);
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    private void unloadCars() {
        if (isPlatformDown) {
            stk.pop();
            distanceCarToTransport = 1;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public void move() {
        super.move();
        for (Car carInStack : stk) {
            carInStack.setxCoordinate(getxCoordinate() + getCurrentSpeed());
            carInStack.setyCoordinate(getyCoordinate() + getCurrentSpeed());
        }
    }

}
