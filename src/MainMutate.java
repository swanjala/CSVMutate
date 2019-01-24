import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainMutate {

    public static void main(String[] args) {

        String csvInput = "/Users/sam/desktop/country/Domicile_table.csv";
        BufferedReader bufferedReader = null;
        String entry = "";
        String delimiter = ",";

        try {

            bufferedReader = new BufferedReader(new FileReader(csvInput));
            while ((entry = bufferedReader.readLine()) != null) {

                String[] dataInCollumn = entry.split(delimiter);

                System.out.println("{value: \"" + dataInCollumn[0] + "\" , "s +
                        "label: \"" + dataInCollumn[1] + "\"},");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}