import java.awt.*;

 class Saab95 extends Car {

     private boolean turboOn;

     public Saab95() {
         super(2, 125, Color.red, "Saab95");
         turboOn = false;
     }

     public void setTurboOn() {
         turboOn = true;
     }

     public void setTurboOff() {
         turboOn = false;
     }

     public boolean getTurboON() { return turboOn; }

     public boolean getTurboOff() { return turboOn; }

     public double speedFactor() {
         double turbo = 1;
         if (turboOn) turbo = 1.3;
         return getEnginePower() * 0.01 * turbo;
     }
 }

