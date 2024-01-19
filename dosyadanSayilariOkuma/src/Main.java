import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/sayi.txt"));
            String line;
            int toplam = 0;
            while ((line = br.readLine()) != null){
                int sayilar = Integer.parseInt(line);

                toplam += sayilar;

                System.out.println(toplam);
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}