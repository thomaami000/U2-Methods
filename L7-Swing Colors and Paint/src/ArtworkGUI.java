import java.awt.*;
import javax.swing.*;

public class ArtworkGUI {

    JFrame art;

    public ArtworkGUI() {

        art = new JFrame("Miya's Artwork!");
        art.setSize(600, 600);
        art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        art.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        art.add(panel);
        art.setVisible(true);

    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
        setBackground(new Color(77, 223, 30));
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(new Color(98, 178, 72));
            g.drawRect(0, 0, 100, 100);
            g.fillRect(0, 0, 100, 100);

            g.setColor(new Color(55, 159, 21));
            g.drawRect(200, 0, 100, 100);
            g.fillRect(200, 0, 100, 100);

            g.setColor(new Color(98, 178, 72));
            g.drawRect(100, 100, 100, 100);
            g.fillRect(100, 100, 100, 100);

            g.setColor(new Color(98, 178, 72));
            g.drawRect(400, 400, 100, 100);
            g.fillRect(400, 400, 100, 100);

            g.setColor(new Color(98, 178, 72));
            g.drawRect(500, 0, 100, 100);
            g.fillRect(500, 0, 100, 100);

            g.setColor(new Color(55, 159, 21));
            g.drawRect(300, 300, 100, 100);
            g.fillRect(300, 300, 100, 100);

            g.setColor(new Color(55, 159, 21));
            g.drawRect(200, 300, 100, 100);
            g.fillRect(200, 300, 100, 100);

            g.setColor(new Color(55, 159, 21));
            g.drawRect(100, 200, 100, 100);
            g.fillRect(100, 200, 100, 100);

            g.setColor(new Color(98, 178, 72));
            g.drawRect(400, 200, 100, 100);
            g.fillRect(400, 200, 100, 100);

            g.setColor(new Color(55, 159, 21));
            g.drawRect(0, 500, 100, 100);
            g.fillRect(0, 500, 100, 100);

            g.setColor(new Color(0, 0, 0));
            g.drawRect(100, 100, 125, 125);
            g.fillRect(100, 100, 125, 125);

            g.setColor(new Color(0, 0, 0));
            g.drawRect(350, 100, 125, 125);
            g.fillRect(350, 100, 125, 125);

            g.setColor(new Color(0, 0, 0));
            g.drawRect(225, 225, 125, 125);
            g.fillRect(225, 225, 125, 125);

            g.setColor(new Color(0, 0, 0));
            g.drawRect(140, 300, 300, 100);
            g.fillRect(140, 300, 300, 100);

            g.setColor(new Color(0, 0, 0));
            g.drawRect(140, 400, 80, 90);
            g.fillRect(140, 400, 80, 90);

            g.setColor(new Color(0, 0, 0));
            g.drawRect(360, 400, 80, 90);
            g.fillRect(360, 400, 80, 90);




        }
    }
}
