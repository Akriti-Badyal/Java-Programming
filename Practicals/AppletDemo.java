import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class AppletDemo extends Applet {

    public void paint(Graphics g) {

        g.drawString("Welcome to Java Applet", 100, 100);
    }

    public static void main(String args[]) {

        JFrame frame = new JFrame("Applet Demo");

        AppletDemo app = new AppletDemo();

        frame.add(app);

        frame.setSize(400, 300);

        frame.setVisible(true);
    }
}