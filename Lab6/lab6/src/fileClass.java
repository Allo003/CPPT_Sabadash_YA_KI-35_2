
import java.io.*;
import java.util.Scanner;

public class fileClass {
    private  double result;
    private double x;


    public void calc(double x){
        Calculate object = new Calculate();
        this.x = x;
        result = object.calc(x);
    }

    public double getResult(){
        return result;
    }


    public void writeResFile(String filename,int n) throws FileNotFoundException{
        PrintWriter file=new PrintWriter(filename);
        for(int i =0;i<n;i++){
            calc(x+i);
            file.printf("%f\n", result);
        }

        file.close();

    }

    public void readResFile(String filename)
    {
        try{

           File f = new File(filename);
           if(f.exists()){
               Scanner s = new Scanner(f);
               result = s.nextDouble();
               s.close();
           }
           else throw new FileNotFoundException("File " + filename + " does not exist");


        }
        catch(FileNotFoundException e){
            System.out.print(e.getMessage());
        }

    }

    public void writeResFileBinary(String filename) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(filename));
       f.writeDouble(result);
    }

    public void readResFileBinary(String filename) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(filename));
        result=f.readDouble();
        f.close();

    }


}
