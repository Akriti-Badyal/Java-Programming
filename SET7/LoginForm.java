import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {

    Label l1, l2, msg;
    Button b;
    TextField t1, t2;

    LoginForm(){
        l1 = new Label("Usename");
        l2 = new Label("Password");

        t1 = new TextField();
        t2 = new TextField();
        
        b = new Button("Login");
        msg= new Label();


    setLayout(new FlowLayout());
     add(l1);
     add(t1);
     add(l2);
     add(t2);
     add(b);
     add(msg);

     b.addActionListener(this);

     setSize(1000,2000);
     setVisible(true);

        
    }

    public void actionPerformed(ActionEvent e){
        if(t1.getText().equals("admin")&& t2.getText().equals("1234")){
            msg.setText("Login Successful");
        }
        else{
            msg.setText("Invalid Login");

        }
    }

    public static void main(String args[] ){
        new LoginForm();
    }


    
}
