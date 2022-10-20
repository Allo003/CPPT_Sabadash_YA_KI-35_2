package Camera_package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DigitalCamera extends Camera implements Seating{
    private double lightFilter;
    private boolean accessories;

    DigitalCamera() throws FileNotFoundException {
        this.accessories=false;
        this.lightFilter=0.5;
    }
    DigitalCamera(double valueZoom, int valueMegapixel, boolean lensStatus, double valuePrice, double valueWeight, double valueLightFilter, boolean valueAssessor) throws FileNotFoundException {
        super(valueZoom,valueMegapixel,lensStatus,valuePrice,valueWeight);
        this.lightFilter=valueLightFilter;
        this.accessories=valueAssessor;
    }

    public double getLightFilter() {
        return this.lightFilter;
    }
    public boolean getAccessories(){
        return this.accessories;
    }
    public void setAccessories(boolean accessories) {
        this.accessories = accessories;
    }

    public void setLightFilter(double lightFilter) {
        this.lightFilter = lightFilter;
    }

    public void changeAccessories(){
    if (this.accessories){
        System.out.println("Now you have accessories ");
        fout.println("Now you have accessories");
        fout.flush();
    }
    else{
        this.accessories=true;
        System.out.println("You get an accessories");
        fout.println("You get an accessories");
        fout.flush();
    }
}
public void increaseLight(double valueLight){
        if (valueLight<0){
            System.out.println("You enter wrong number");
            fout.println("You enter wrong number");
            fout.flush();
        }
        else{
            this.lightFilter+=valueLight;
            System.out.println("You increase your light filter");
            fout.println("You increase your light filter");
            fout.flush();
        }

}
public void reduseLight (double valueLight){
        if (valueLight>this.lightFilter){
            System.out.println("You enter wrong number");
            fout.println("You enter wrong number");
            fout.flush();
        }
        else{
            this.lightFilter-=valueLight;
            System.out.println("You reduse your light filter");
            fout.println("You reduse your light filter");
            fout.flush();
        }
}

    public void DigitalCameraStartRecording() {
        System.out.println("Now you start recording");
        if(lens1.getMegapixel()>15){
            System.out.println("Now you recording 720p, but you can change it");
        }
        else{
            System.out.println("You don't have opportunity change your seating of the recording");
        }
    }

    public void SeatingOfTheRecording() {
        System.out.println("You change your seating of recording and now you recording 1080p");
        this.lightFilter++;
        System.out.println("You change light filter");
        fout.print("You change your seating of recording and now you recording 1080p\n");

    }
    public void allInfo(){
        System.out.println("Price is "+ charact1.getPrice() + "$");
        System.out.println("Weight is "+ charact1.getWeight() + "Kg");
        System.out.println("Camera has "+ lens1.getMegapixel() +" megapixels");
        System.out.println("Camera status "+ lens1.getLensStatus() +" (If true - you have clean lens, else your lens is untidy");
        System.out.println("Zoom of camera is "+ zoom1.getZoomValue());
        System.out.println("Light Filter is " + getLightFilter());
        System.out.println("You have accessions " + getAccessories());
        fout.println("You look all info");
        fout.flush();
    }
}
