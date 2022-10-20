package Camera_package;

import java.io.FileNotFoundException;

public class Lab3 {
    public static void main(String []args) throws FileNotFoundException {
        Camera camera1 = new Camera(7.2,9,false,20.3,0.7);
        camera1.allInfo();
        camera1.cameraCleanLens();
        camera1.cameraGetDiscount();
        camera1.cameraIncreaseZoom(1.2);
        camera1.cameraRecommendation();
        camera1.cameraReduseZoom(2.4);
        camera1.cameraInfoLens();
        camera1.cameraSetMegapixel(2);
        camera1.cameraStartRecording();
        camera1.allInfo();
    }
}
