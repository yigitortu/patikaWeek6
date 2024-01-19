import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner

        System.out.print("Bir şeyler yazınız : ");
        String basicText = input.nextLine();

        try {
            // File Writer tanıtıldı.
            FileWriter fWriter = new FileWriter("notlar.txt");
            PrintWriter pWriter = new PrintWriter(fWriter);

            pWriter.println(basicText);
            pWriter.close();

            // File reader tanıtıldı.
            FileReader fReader = new FileReader("notlar.txt");
            BufferedReader br = new BufferedReader(fReader);

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();



            /*FileReader fReader = new FileReader("notlar.txt");
            BufferedReader br = new BufferedReader(fReader);
            String okunanMetin = br.readLine();*/


        } catch (Exception e) {
            System.out.println("Dosyaya yazma işlemi sırasında hata oluştu");
        }


    }
    }
