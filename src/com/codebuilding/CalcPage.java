package com.codebuilding;

import javax.swing.*;

public class CalcPage extends JFrame{
    private JButton a2Button;
    private JButton a3Button;
    private JButton addbutton;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minusbutton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton multiplyButton;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton clearButton;
    private JButton a0Button;
    private JButton decimalbutton;
    private JButton dividebutton;
    private JTextField result;
    private JButton solvebutton;
    private JPanel CalculatorP;
    private double Temp1, Temp2, Solve;

    Boolean addbool = false;
    Boolean subbool = false;
    Boolean mulbool = false;
    Boolean divbool = false;

    String Display = "";

    public CalcPage() {
        clearButton.addActionListener(e -> {
            result.setText("");
            addbool = false;
            subbool = false;
            mulbool = false;
            divbool = false;

            Temp1 = 0;
            Temp2 = 0;
            Solve = 0;
        });

        a1Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "1");
        });

        a2Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "2");
        });

        a3Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "3");
        });

        a4Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "4");
        });

        a5Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "5");
        });

        a6Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "6");
        });

        a7Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "7");
        });

        a8Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "8");
        });

        a9Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "9");
        });

        a0Button.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + "0");
        });

        decimalbutton.addActionListener(e -> {
            Display = result.getText();
            result.setText(Display + ".");
        });

        addbutton.addActionListener(e -> {
            Temp1 = Double.parseDouble(result.getText());
            result.setText("");
            addbool = true;
            subbool = false;
            mulbool = false;
            divbool = false;
        });

        minusbutton.addActionListener(e -> {
            Temp1 = Double.parseDouble(result.getText());
            result.setText("");
            addbool = false;
            subbool = true;
            mulbool = false;
            divbool = false;
        });

        multiplyButton.addActionListener(e -> {
            Temp1 = Double.parseDouble(result.getText());
            result.setText("");
            addbool = false;
            subbool = false;
            mulbool = true;
            divbool = false;
        });

        dividebutton.addActionListener(e -> {
            Temp1 = Double.parseDouble(result.getText());
            result.setText("");
            addbool = false;
            subbool = false;
            mulbool = false;
            divbool = true;
        });

        solvebutton.addActionListener(e -> {
            Temp2 = Double.parseDouble(result.getText());
            if (addbool)
                Solve = Temp1 + Temp2;
            else if (subbool)
                Solve = Temp1 - Temp2;
            else if (mulbool)
                Solve = Temp1 * Temp2;
            else if (divbool)
                Solve = Temp1 / Temp2;

            result.setText(Double.toString(Solve));
        });
    }

    public static void main(String[] args) {
        JFrame CalcFrame;
        CalcFrame = new JFrame("Calculator");
        CalcFrame.setContentPane(new CalcPage().CalculatorP);
        CalcFrame.pack();
        CalcFrame.setSize(500,500);
        CalcFrame.setVisible(true);
        CalcFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        CalcFrame.setLocationRelativeTo(null);
    }
}