public class Calculate {
    public double calc(double x){

        //8. y=sin(x)/sin(2x-4)
        double rad=x*Math.PI/180;
        double y;
        double rad2 = ((2 * x -4) * Math.PI/180) ;

        try{

            y=Math.sin(rad)/Math.sin(rad2);
            if(y== Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || y==Double.NaN || Math.abs((rad2)%Math.PI)==0)
                throw new ArithmeticException();
        }

        catch(ArithmeticException e){
            if(Math.abs(rad2%Math.PI)==0)
                throw new CalcException("Exception reason: divide by zero");
            else
                throw new CalcException("Exception reason: Unknown reason of the exception during exception calculation");



        }
        return y;
    }

}