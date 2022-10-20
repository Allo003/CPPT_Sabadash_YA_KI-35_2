import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int nColumns;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        // Створення файлу для запису
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        // Присвоєння довжини з консолі
        System.out.print("Enter the matrix length : ");
        nColumns = in.nextInt();
        in.nextLine();
        // Перевірка довжини
        if(nColumns<=0){
            System.out.println("Incorrect number , enter a positive number");
        }
        else {
            // Вибір символу для массиву

            System.out.print("\nEnter the matrix symbol : ");
            filler = in.nextLine();
            in.close();
            //Перевірка символу
            if(filler.length() != 1){
                System.out.println("Incorrect symbol");
            }
            else {

                // Створення зубчастого массиву та його заповнення
                arr = new char[nColumns][];
                for (int i = 0; i < nColumns; i++) {
                    if (i < nColumns / 2) {
                        arr[i] = new char[i + 1];
                        for (int j = 0; j <= i; j++) {
                            arr[i][j] = (char) filler.codePointAt(0);
                            //System.out.print(arr[i][j] + "  ");
                        }
                    }
                    else  {
                        arr[i] = new char[nColumns-i + 1];
                        for (int j = 0; j < nColumns - i ; j++)
                        {
                            arr[i][j] = (char) filler.codePointAt(0);
                            //System.out.print(arr[i][j] + "  ");
                        }
                    }
                    //System.out.println("\n");
                }



                // Вивід та запис у файл массиву
                for(int i = 0; i < nColumns; i++)
                {
                    for(int j = 0; j < nColumns; j++)
                    {
                        if (i >= nColumns / 2 && (j <= i && j >= nColumns-i-1))
                        {
                            System.out.print(arr[j][nColumns-i-1]+"  ");
                            fout.print(arr[i][nColumns-i-1] + "  ");
                        }
                        else {
                            System.out.print("!  ");
                            fout.print("!  ");
                        }
                    }
                    System.out.print("\n");
                    fout.print("\n");

                }




                fout.flush();
                fout.close();

            }

        }



    }
}