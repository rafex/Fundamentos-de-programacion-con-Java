package mx.rafex.cursos.fundamentos.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends Frame implements ActionListener {

    private static final long serialVersionUID = -6123855270895380633L;

    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JPasswordField p1;

    LoginForm() {
        super("Login Form");
        setVisible(true);
        this.setBounds(-1, -1, 600, 600);
        final Panel panel = new Panel();
        l1 = new JLabel("Login Form");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));

        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton("Login");

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        p1.setBounds(300, 110, 200, 30);
        btn1.setBounds(150, 160, 100, 30);

        panel.add(l1);
        panel.add(l2);
        panel.add(tf1);
        panel.add(l3);
        panel.add(p1);
        panel.add(btn1);

        btn1.addActionListener(e -> {
            bb();
        });

        panel.setSize(600, 600);
//        panel.setLayout(null);
        panel.setVisible(true);

        add(panel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                exitForm(evt);
            }
        });
    }

    public void bb() {
        System.out.println("Estoy haciendo algo...");
        final String uname = tf1.getText();
        final String pass = new String(p1.getPassword());
        if (uname.equals("rafex") && pass.equals("123")) {
            final Welcome wel = new Welcome();
            wel.setVisible(true);
            final JLabel label = new JLabel("Welcome:" + uname);
            wel.add(label);
        } else
            JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void exitForm(final WindowEvent evt) {
        System.out.print("Saliendo...");
        System.exit(0);
    }

    public static void main(final String[] args) {
        new LoginForm();
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println(e);
        System.out.println(e.getActionCommand());

    }
}

class Welcome extends Frame {

    private static final long serialVersionUID = 3233155516987285057L;

    Welcome() {

        setTitle("Welcome");
        setSize(400, 200);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                try {
                    finalize();
                } catch (final Throwable e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}
