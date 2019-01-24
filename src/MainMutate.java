import javax.swing.*;

import java.util.ArrayList;

public class MainMutate {

    public static void main(String[] args) {
        String path = JOptionPane.showInputDialog("Enter path to file");
        InputsInteraface inputsInteraface = new Inputs();
        ArrayList<String[]> responseData = inputsInteraface.csvInput(path);

        JOptionPane.showMessageDialog(null,"data collected"+
                responseData.iterator());

    }


}