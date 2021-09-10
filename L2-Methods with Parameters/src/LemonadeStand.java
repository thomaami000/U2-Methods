import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {

    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */
            public static double _16Price = 0.5;
            public static double _20Price = 0.99;
            public static double tax = 0.075;


    public static void main(String[] args) {
        int numOf16 = Integer.parseInt(JOptionPane.showInputDialog("How many 16oz cups of lemonade do you want to buy?"));
        int numOf20 = Integer.parseInt(JOptionPane.showInputDialog("How many 20oz cups of lemonade do you want to buy?"));

        calcCost(numOf16, numOf20);
    }

    public static void calcCost(int numOf16, int numOf20){
        DecimalFormat round = new DecimalFormat("$#,###.00");
        double originalTotal = (_16Price * numOf16) + (_20Price * numOf20);
        double taxTotal = (_16Price + _20Price) * (1 + tax);

        double total = originalTotal - taxTotal;

        String message = "Your order: ";
        message += "\n Number of 16 oz: " + numOf16;
        message += "\n Number of 20 oz: " + numOf20;
        message += "\n\n Your total is: " + round.format(total);

        JOptionPane.showMessageDialog(null, message);
    }




}
