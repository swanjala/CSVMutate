import java.io.*;
import java.util.ArrayList;

public class Inputs {

    public ArrayList<String[]> csvInput(String path) {

        BufferedReader bufferedReader = null;
        String entry = "", delimiter = ",";
        ArrayList<String[]> dataCollection = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new
                    FileReader(path));
            while((entry =bufferedReader.readLine()) != null){

                String [] dataInCollumn = entry.split(delimiter);
                dataCollection.add(dataInCollumn);

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {

                if (bufferedReader != null){
                    try{
                        bufferedReader.close();

                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }

        }

        return dataCollection;
    }


}
