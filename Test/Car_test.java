import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Car_test {

    @Test
    void car_should_have_doors() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.getNrDoors();
        v.getNrDoors();
        assertEquals(2, s.getNrDoors());
        assertEquals(4, v.getNrDoors());
    }

    @Test
    void car_should_have_model_name() {
        Saab95 car = new Saab95();
        car.getModelName();
        assertEquals("Saab95", car.getModelName());
    }

    @Test
    void car_should_have_engine_power() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.getEnginePower();
        v.getEnginePower();
        assertEquals(125, s.getEnginePower(), 0.01);
        assertEquals(100, v.getEnginePower(), 0.01);
    }

    @Test
    void car_should_have_a_color() {
        Saab95 car = new Saab95();
        car.getColor();
        assertEquals("Car", car.getColor());
    }

    @Test
    void car_should_have_speed_zero() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        assertEquals(0, s.getCurrentSpeed(), 0.01);
        assertEquals(0, v.getCurrentSpeed(), 0.01);
    }


    @Test
    void car_should_have_low_speed_after_starting_engine() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.startEngine();
        v.startEngine();
        assertEquals(0.1, s.getCurrentSpeed(), 0.01);
        assertEquals(0.1, v.getCurrentSpeed(), 0.01);
    }


    @Test
     void car_should_have_no_speed_when_stopping_engine() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.stopEngine();
        v.stopEngine();
        assertEquals(0, s.getCurrentSpeed(), 0.01);
        assertEquals(0, v.getCurrentSpeed(), 0.01);
    }



    @Test
    void car_should_have_x_coordinate_0() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.getxCoordinate();
        v.getxCoordinate();
        assertEquals(0, s.getxCoordinate(), 0.01);
        assertEquals(0, v.getxCoordinate(), 0.01);
    }

    @Test
    void car_should_move_in_x() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.startEngine();
        v.startEngine();
        s.move();
        v.move();
        assertEquals(0.1, s.getxCoordinate(), 0.01);
        assertEquals(0.1, v.getxCoordinate(), 0.01);
    }

    @Test
    void car_should_move_in_y() {
        Saab95 s = new Saab95();
        Volvo240 v = new Volvo240();
        s.startEngine();
        v.startEngine();
        s.move();
        v.move();
        assertEquals(0.1, s.getyCoordinate(), 0.01);
        assertEquals(0.1, v.getyCoordinate(), 0.01);
    }

    @Test
    void car_should_increse_speed_with_gas() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.gas(0.2);
        assertEquals(0.35, car.getCurrentSpeed(), 0.01);

    }

    @Test
    void car_should_decrease_speed_with_break() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        car.gas(0.2);
        car.brake(0.1);
        assertEquals(0.225, car.getCurrentSpeed(), 0.01);
    }

}