import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Saab95test {

    @Test
    void car_should_move_in_coordinate_system_with_currentSpeed() {
        Saab95 car = new Saab95();
        car.move();
        assertEquals(car.getCurrentSpeed(), 0.01);
    }

    @Test
    void saab_should_have_speed_factor() {
    Saab95 car = new Saab95();
    car.move();
    car.speedFactor();
    assertEquals(1.25, car.speedFactor());
    }
}
