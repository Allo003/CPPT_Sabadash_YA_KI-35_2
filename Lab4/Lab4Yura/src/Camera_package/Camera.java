package Camera_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Camera {
    protected Zoom zoom1;
    protected Lens lens1;
    protected OtherCharact charact1;
    protected PrintWriter fout;

    Camera() throws FileNotFoundException {
        zoom1 =new Zoom();
        lens1 = new Lens();
        charact1 = new OtherCharact();
        fout = new PrintWriter(new File("Result.txt"));
    }

    Camera(double valueZoom, int valueMegapixel, boolean lensStatus, double valuePrice, double valueWeight) throws FileNotFoundException{
        zoom1 = new Zoom(valueZoom);
        lens1 = new Lens(valueMegapixel,lensStatus);
        charact1 = new OtherCharact(valuePrice, valueWeight);
        fout = new PrintWriter(new File("Result.txt"));
    }

    public void cameraSetZoom(double valueZoom){
        zoom1.setZoomValue(valueZoom);
        fout.print("You change Zoom Value\n");
        fout.flush();
    }
    public void cameraIncreaseZoom(double valueZoom){
        zoom1.increaseZoom(valueZoom);
        System.out.println("Now Zoom is "+ zoom1.getZoomValue());
        fout.print("You change Zoom Value\n");
        fout.flush();
    }
    public void cameraReduseZoom(double valueZoom){
        zoom1.reduseZoom(valueZoom);
        System.out.println("Now Zoom is "+ zoom1.getZoomValue());
        fout.print("You change Zoom Value\n");
        fout.flush();
    }

    public void cameraGetDiscount(){
        charact1.getDiscount();
        fout.println("You get discount");
        fout.flush();
    }

    public void cameraRecommendation(){
        charact1.recommendation();
    }
    public void cameraSetMegapixel(int valueMegapixel){
        lens1.setMegapixel(valueMegapixel);
    }
    public void cameraStartRecording(){
        lens1.startRecording();
        fout.print("Camera start recording\n");
        fout.flush();
    }
    public void cameraCleanLens(){
        lens1.cleanLens();
        fout.print("Now you have tidy lens\n");
        fout.flush();
    }
    public void cameraInfoLens(){
        lens1.showInfoAboutLens();
        fout.println("You look info");
        fout.flush();
    }

    public void allInfo(){
        System.out.println("Price is "+ charact1.getPrice() + "$");
        System.out.println("Weight is "+ charact1.getWeight() + "Kg");
        System.out.println("Camera has "+ lens1.getMegapixel() +" megapixels");
        System.out.println("Camera status "+ lens1.getLensStatus() +" (If true - you have clean lens, else your lens is untidy");
        System.out.println("Zoom of camera is "+ zoom1.getZoomValue());
        fout.println("You look all info");
        fout.flush();
    }
}
