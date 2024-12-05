package pekan8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KALKULATOR {

    private JFrame frame;
    private JTextField display;
    private double num1, num2, result;
    private String operator;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
            	KALKULATOR window = new KALKULATOR();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public KALKULATOR() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Kalkulator");
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        frame.getContentPane().add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

        String[] buttons = {
            "<", "C", "00", "+",
            "7", "8", "9", "-",
            "4", "5", "6", "×",
            "1", "2", "3", "÷",
            "0", ".", "=", "%" 
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(e -> onButtonPress(text));
            buttonPanel.add(button);
        }
    }

    private void onButtonPress(String text) {
        try {
            if (text.matches("\\d|\\.")) {
                display.setText(display.getText() + text);
            } else if (text.equals("00")) {
                display.setText(display.getText() + "00");
            } else if (text.matches("[+\\-×÷%]")) {
                num1 = Double.parseDouble(display.getText());
                operator = text;
                display.setText("");
            } else if ("=".equals(text)) {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "×" -> result = num1 * num2;
                    case "÷" -> result = num2 != 0 ? num1 / num2 : Double.NaN; // Tangani pembagian dengan nol
                    case "%" -> result = num1 % num2;
                }
                display.setText(String.valueOf(result));
            } else if ("C".equals(text)) {
                display.setText("");
                num1 = num2 = result = 0;
                operator = null;
            } else if ("<".equals(text)) {
                String currentText = display.getText();
                if (!currentText.isEmpty()) {
                    display.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }
}