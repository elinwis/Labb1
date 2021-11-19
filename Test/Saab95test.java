import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Saab95test {

    @
    Saab95 car = new Saab95();
    car.startEngine();

    @Test
    void car_should_move_in_coordinate_system_with_currentSpeed() {
        Saab95 car = new Saab95();
        car.move();
        assertEquals(car.getCurrentSpeed(), 0.01);
    }

    @Test
    void car_should_increment_speed() {
        Saab95 car = new Saab95();
        car.getCurrentSpeed();
        car.speedFactor();

    }

    @Test
    void car_should_decrement_speed() {
        Saab95 car = new Saab95();
        car.getCurrentSpeed();
        car.speedFactor();


    }

}
