package Camera_package;

import javax.swing.*;

public class Lens {
  private int megapixel;
  private boolean lensStatus;
  Lens(){
      this.megapixel=5;
      this.lensStatus=true;
  }
  Lens(int megapixel, boolean lensStatus){
      this.megapixel=megapixel;
      this.lensStatus=lensStatus;
  }
  public int getMegapixel(){
   return this.megapixel;
  }
  public void setMegapixel(int valueMegapixel){
      if (valueMegapixel<0){
          System.out.println("Megapixel cannot be less than 0");
      }else{
      this.megapixel=valueMegapixel;
      }
  }

  public boolean getLensStatus(){
      return lensStatus;
  }
  public void setLensStatus(boolean valueLensStatus){
      this.lensStatus=valueLensStatus;
  }
  public void startRecording(){
      if (megapixel<10){
          System.out.println("You start recording 720p ");
      }
      else{
          System.out.println("You start recording 1080p ");
      }
  }

  public void cleanLens(){ // продебажити
      if (lensStatus){
          System.out.println("You have tidy lens ");
      }
      else{
          lensStatus=true;
          System.out.println("You clean your lens ");
      }
  }

  public void showInfoAboutLens(){
      System.out.println("Your lens have " +getMegapixel() + " megapixel");
      System.out.println("Your lens status " +getLensStatus() + " (If true - you have clean lens, else your lens is untidy");
  }
}