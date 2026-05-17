import java.awt.*;
import java.awt.event.*;

class ButtonEventDemo extends Frame implements ActionListener {

    Button b;

    ButtonEventDemo() {

        b = new Button("Click Me");

        b.setBounds(200, 200, 100, 40);

        add(b);

        setSize(500, 500);

        setLayout(null);

        setVisible(true);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("Button Clicked");
    }

    public static void main(String args[]) {

        new ButtonEventDemo();
    }
}
