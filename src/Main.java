import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cars saab = new Saab95();
        Cars volvo = new Volvo240();
        volvo.getCurrentSpeed();
        saab.getNrDoors();
    }
}
