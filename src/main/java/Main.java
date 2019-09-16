import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        String fileName;
        System.out.println("Enter File's name : ");
        fileName = inp.nextLine();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            String line;

            while ( ( line = bufferedReader.readLine() ) != null){
                System.out.println(line);
            }

        } finally {
            bufferedReader.close();
        }
    }
}
