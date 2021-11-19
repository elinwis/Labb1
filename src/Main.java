public class Main {
    public static void main(String[] args) {
        Car saab = new Saab95();
        Car volvo = new Volvo240();
        volvo.getCurrentSpeed();
        saab.getNrDoors();
    }
}
