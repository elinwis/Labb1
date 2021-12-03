import java.awt.*;

public abstract class Vehicle implements Movable{
        private final int nrDoors; // Number of doors on the car
        private final double enginePower; // Engine power of the car
        private double currentSpeed; // The current speed of the car
        private Color color; // Color of the car
        private final String modelName; // The car model name
        private double xCoordinate, yCoordinate;
        private float angleCar = 0;

        public Vehicle (int nrDoors, double enginePower, Color color, String modelName) {
            this.nrDoors = nrDoors;
            this.enginePower = enginePower;
            this.color = color;
            this.modelName = modelName;
            this.stopEngine();
        }

    /**
     *
     * @return
     */
        public int getNrDoors() {
            System.out.println(nrDoors);
            return nrDoors;
        }

        public String getModelName() {
            return modelName;
        }

        public double getEnginePower() {
            return enginePower;
        }

        private void setCurrentSpeed(double speed) {
            if (speed < 0 || speed > enginePower) {
                throw new IllegalArgumentException("Invalid Input");
            } else { currentSpeed = speed;}
        }

        public double getCurrentSpeed() {
            return currentSpeed;
        }

        public void setColor(Color clr) {
            color = clr;
        }

        public Color getColor() {
            System.out.println(color);
            return color;
        }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void move() {
            xCoordinate += currentSpeed;
            yCoordinate += currentSpeed;
        }

        public void setAngleCar(){
            xCoordinate += Math.cos(angleCar) * currentSpeed;
            yCoordinate += Math.sin(angleCar) * currentSpeed;
        }
        public double getAnglecar() {
            return angleCar;
        }

        public void turnLeft() {
            angleCar += Math.PI / 2;
            setAngleCar();
        }

        public void turnRight() {
            angleCar -= Math.PI / 2;
            setAngleCar();
        }

        public void startEngine() {
            currentSpeed = 0.1;
        }

        public void stopEngine() {
            currentSpeed = 0;
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

        public void incrementSpeed(double amount){
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower)); }

        private void decrementSpeed(double amount){
            setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));}

    }
