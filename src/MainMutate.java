import net.sf.json.JSONObject;

import javax.swing.*;

import java.util.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MainMutate {

    public static void main(String[] args) throws IOException {
//        String path = JOptionPane.showInputDialog("Enter path to file");
//        InputsInteraface inputsInteraface = new Inputs();
//        ArrayList<String[]> responseData = inputsInteraface.csvInput(path);
//
//        JOptionPane.showMessageDialog(null,"data collected"+
//
//                responseData.iterator());
//
//        for (int i = 0; i <responseData.size() ; i++) {
//
//            System.out.println(responseData.get(i));
//
//        }
                CurrentCountry country = new CurrentCountry();

                ArrayList<String> dataCollection = new ArrayList<>();
                List<String> countries =  country.getCountries();

                String csvInput = "/Users/sam/desktop/data/coutrylist/domicile.csv";
                BufferedReader bufferedReader = null;
                String entry = "";
                String delimiter = ",";

                try {

                    bufferedReader = new BufferedReader(new FileReader(csvInput));
                    while ((entry = bufferedReader.readLine()) != null) {

                        String[] dataInCollumn = entry.split(delimiter);

                     //   System.out.println("{value: \"" + dataInCollumn[1] + "\" , " + "label: \"" + dataInCollumn[1] + "\"},");

                        dataCollection.add("{value: \"" + dataInCollumn[1] + "\" , " + "label: \"" + dataInCollumn[1] + "\"},");

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

        for (int i = 0; i < countries.size() ; i++) {
            System.out.println("data "+ countries.get(i));
        }

        Collections.sort(dataCollection, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        for (int i = 0; i <dataCollection.size() ; i++) {
            System.out.println(dataCollection.get(i));
            JSONObject jsonObject = new JSONObject(dataCollection.get(i));
        }
            }

        }


