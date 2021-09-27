import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing

     PLAN:
     1. get 3 inputs
     2. isolate last three letters of each word
     3. combine all three endings
     4. output
     */


    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter word 1: ");
        String word2 = JOptionPane.showInputDialog("Enter word 2: ");
        String word3 = JOptionPane.showInputDialog("Enter word 3: ");

        JOptionPane.showMessageDialog(null, lastThree(word1) + lastThree(word2) + lastThree(word3));
        System.exit(0);

    }
    public static String lastThree(String word){
        return word.substring(word.length()-3);

    }

}
