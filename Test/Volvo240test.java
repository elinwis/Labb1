import org.junit.jupiter.api.Test;

public class Volvo240test {
    @Test
    void car_should_increment_speed() {
        Volvo240 car = new Volvo240();
        car.getCurrentSpeed();
        car.speedFactor();

    }

    @Test
    void car_should_decrement_speed() {
        Volvo240 car = new Volvo240();
        car.speedFactor();



    }

}
