package Camera_package;

public class Zoom {
    private double zoomValue;
    Zoom(){
        this.zoomValue=0;
    }
    Zoom(double zoomValue){
        this.zoomValue=zoomValue;
    }

    public double getZoomValue() {
        return zoomValue;
    }
    public void setZoomValue(double zoomValue){
        this.zoomValue=zoomValue;
    }

    public void increaseZoom(double valueZoom){
        if (valueZoom<0){
            System.out.println("You enter wrong value");
        }
        else{
            this.zoomValue+=valueZoom;
            System.out.println("Zoom ++");
        }
    }
    public void reduseZoom(double valueZoom){
        if (valueZoom>this.zoomValue){
            System.out.println("You enter wrong value");
        }
        else{
            this.zoomValue-=valueZoom;
            System.out.println("Zoom --");
        }
    }


}
