import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static JTextField input1;
    static JTextField input2;
    static JLabel instruct;
    static JLabel answerLabel;

    public static void main(String[] args) {

        JFrame window = new JFrame("Basic Calculator");
        JPanel panel = new JPanel();
        input1 = new JTextField(10);
        input2 = new JTextField(10);
        instruct = new JLabel("Enter a number: ");
        instruct = new JLabel("Enter a number: ");

        JButton sub = new JButton("Subtract");
        JButton add = new JButton("Add");
        JButton multip = new JButton("Multiply");
        JButton div = new JButton("Divide");

        answerLabel = new JLabel("0.00");

        window.setSize(150, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        sub.addActionListener(new subtract());
        add.addActionListener(new addition());
        multip.addActionListener(new multiply());
        div.addActionListener(new divide());

        panel.add(input1);
        panel.add(input2);

        panel.add(answerLabel);

        panel.add(sub);
        panel.add(add);
        panel.add(multip);
        panel.add(div);

        window.add(panel);
        window.setVisible(true);

    }

    private static class subtract implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(input1.getText());
            double number2 = Double.parseDouble(input2.getText());

            answerLabel.setText(String.valueOf(number1 - number2));

        }
    }

    private static class addition implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(input1.getText());
            double number2 = Double.parseDouble(input2.getText());

            answerLabel.setText(String.valueOf(number1 + number2));

        }
    }

    private static class multiply implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(input1.getText());
            double number2 = Double.parseDouble(input2.getText());

            answerLabel.setText(String.valueOf(number1 * number2));

        }
    }

    private static class divide implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(input1.getText());
            double number2 = Double.parseDouble(input2.getText());

            answerLabel.setText(String.valueOf(number1 / number2));

        }
    }

}
