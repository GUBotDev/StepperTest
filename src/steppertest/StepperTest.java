/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steppertest;

import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author mark
 */
public class StepperTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        //Pin stepPin, Pin dirPin, Pin sleepPin,
        //Pin enablePin, Pin ms1Pin, Pin ms2Pin, Pin resetPin
        EasyDriver drvr = new EasyDriver(0, RaspiPin.GPIO_15, RaspiPin.GPIO_16,
        RaspiPin.GPIO_01, RaspiPin.GPIO_11, RaspiPin.GPIO_10, RaspiPin.GPIO_06,
        RaspiPin.GPIO_04);
        
        
    }
    
}
