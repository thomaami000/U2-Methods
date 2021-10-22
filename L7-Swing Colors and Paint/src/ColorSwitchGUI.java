import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color Switcheroo");
    JPanel panel = new JPanel();
    JButton buttonThemeBlue = new JButton("Theme: Blue");
    JButton buttonThemeRed = new JButton("Theme: Red");
    JButton buttonThemePrimary = new JButton("Theme: Primary");


    public ColorSwitchGUI(){
        //create your GUI
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        //Add action listeners to buttons
        buttonThemeBlue.addActionListener(new ThemeBlue());
        buttonThemeRed.addActionListener(new ThemeRed());
        buttonThemePrimary.addActionListener(new ThemePrimary());

        panel.add(buttonThemeBlue);
        panel.add(buttonThemeRed);
        panel.add(buttonThemePrimary);

        window.add(panel);
        window.setVisible(true);

    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeBlue implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = new Color(20, 30, 97);
            Color buttonBack = new Color(0, 48, 115);
            Color buttonText = new Color(0, 152, 241);

            panel.setBackground(panelBack);
            buttonThemeBlue.setBackground(buttonBack);
            buttonThemeBlue.setForeground(buttonText);
            buttonThemeRed.setBackground(buttonBack);
            buttonThemeRed.setForeground(buttonText);
            buttonThemePrimary.setBackground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);
        }
    }
    private class ThemeRed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = new Color(149, 1, 1);
            Color buttonBack = new Color(255, 0, 0);
            Color buttonText = new Color(61, 0, 0);

            panel.setBackground(panelBack);
            buttonThemeBlue.setBackground(buttonBack);
            buttonThemeBlue.setForeground(buttonText);
            buttonThemeRed.setBackground(buttonBack);
            buttonThemeRed.setForeground(buttonText);
            buttonThemePrimary.setBackground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);
        }
    }
    private class ThemePrimary implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = Color.RED;
            Color buttonBack = Color.BLUE;
            Color buttonText = Color.YELLOW;

            panel.setBackground(panelBack);
            buttonThemeBlue.setBackground(buttonBack);
            buttonThemeBlue.setForeground(buttonText);
            buttonThemeRed.setBackground(buttonBack);
            buttonThemeRed.setForeground(buttonText);
            buttonThemePrimary.setBackground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);
        }
    }
}
