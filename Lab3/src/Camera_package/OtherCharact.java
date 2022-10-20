package Camera_package;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OtherCharact {
    private double price;
    private double weight;

    OtherCharact(){
        this.price=100;
        this.weight= 1.0;
    }
    OtherCharact(double price, double weight){
        this.price=price;
        this.weight=weight;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getDiscount(){
        if (price<1000){
            System.out.println("You don't get a discount");
        }
        else{
            double discount=this.price/10;
            this.price-=discount;
        }
    }
    public void recommendation(){
        if(this.weight>1){
            System.out.println("You must buy case");
        }
        else{
            System.out.println("You must buy strap");
        }
    }
}

