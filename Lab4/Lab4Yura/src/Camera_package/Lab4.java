package Camera_package;

import java.io.FileNotFoundException;

public class Lab4 {
    public static void main (String [] args) throws FileNotFoundException {
        DigitalCamera dcamera1 = new DigitalCamera(7.2,50,false,150.3,2.1,10.4,false);
        dcamera1.allInfo();
        System.out.println("\n\n");
        dcamera1.changeAccessories();
        dcamera1.SeatingOfTheRecording();
        dcamera1.DigitalCameraStartRecording();
        dcamera1.increaseLight(4);
        dcamera1.cameraCleanLens();
        System.out.println("\n\n");
        dcamera1.allInfo();
    }
}
