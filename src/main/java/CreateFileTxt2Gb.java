import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class CreateFileTxt2Gb {
    public static void main(String[] args) throws IOException {

        double wantedSize = Double.parseDouble("2.0");
        Random rd = new Random();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter File's name you want create : ");
        File file = new File(inp.nextLine());

        PrintWriter printWriter = new PrintWriter(file);

        int count = 0;

        while(true){
            for(int i = 0; i < 100; i++){
                int randomNumber = rd.nextInt(10);
                printWriter.print(randomNumber);
            }
            printWriter.println();
            count++;

            if(count == 100000){
                if( file.length() >= wantedSize * 1e9){
                    printWriter.close();
                    break;
                }
                else{
                    count = 0;
                }
            }
        }
    }
}
