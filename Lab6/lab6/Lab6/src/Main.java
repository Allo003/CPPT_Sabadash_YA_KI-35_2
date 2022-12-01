import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      double x=23;

      fileClass file=new fileClass();

      file.calc(x);
      System.out.println("Res="+file.getResult());

      file.writeResFile("Result.txt",7);
      file.readResFile("Result.txt");
      System.out.println("Res="+file.getResult());








    }
}