package GUI;

import Calculations.Polynomial;
import Calculations.Routh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RouthGUI extends JFrame implements ActionListener {

    private JTextField inputField;
    private JTextField outputArea;

    public RouthGUI() {
        // Set the title of the JFrame
        setTitle("My Routh App");

        // Create the input field
        inputField = new JTextField(10);
        inputField.addActionListener(this);
        Font font = inputField.getFont();
        font = font.deriveFont(font.getSize() * 2.0f);
        inputField.setFont(font);
        // Create the output area
        outputArea = new JTextField(10);
        outputArea.setEditable(false);
        outputArea.setFont(font);
        // Create the scroll pane for the output area
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Create a panel to hold the input field and the scroll pane
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.NORTH);
        inputPanel.add(scrollPane, BorderLayout.CENTER);

        // Add the input panel to the JFrame
        add(inputPanel);

        // Set the size of the JFrame
        setSize(800, 600);

        // Make the JFrame visible
        setVisible(true);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = inputField.getText();
        String numbers[] = s.split(" ") ;
        double []input = new double[numbers.length] ;
        for(int i = 0 ; i < numbers.length ; i++){
            input[i] = Double.parseDouble(numbers[i]) ;
        }
        for(int i = 1 ; i < input.length ; i++){
            input[i] /= input[0] ;
        }
        input[0] = 1 ;
        Routh routh = new Routh(input) ;
        Polynomial polynomial = new Polynomial() ;
        int rightRoots = routh.check() ;
        if(rightRoots == 0){
            outputArea.setText("Stable");
        }
        else {
            outputArea.setText("UnStable!");
        }
        //inputField.setText("");
    }

    public static void main(String[] args) {
        // Create an instance of MySwingApp
        RouthGUI app = new RouthGUI();
    }
}
