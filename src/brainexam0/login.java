package brainexam0;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;

public class login extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;
    private JButton button;
    private JLabel label;
    private JLabel label_1;
    private JButton button_1;

    login() {
        
        // User Label
        user_label = new JLabel();
        user_label.setHorizontalAlignment(SwingConstants.CENTER);
        user_label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
        user_label.setText("User Name :");
        userName_text = new JTextField();
        userName_text.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
        password_text = new JPasswordField();
        password_text.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));

        panel = new JPanel(new GridLayout(3, 1));

        panel.add(user_label);
        panel.add(userName_text);
        
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
        panel.add(label);
        
        // Password

        password_label = new JLabel();
        password_label.setHorizontalAlignment(SwingConstants.CENTER);
        password_label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
        password_label.setText("Password :");
        panel.add(password_label);
        panel.add(password_text);
        
        button = new JButton("\uD68C\uC6D0\uAC00\uC785");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        button.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
        
        label_1 = new JLabel();
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
        panel.add(label_1);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel, BorderLayout.CENTER);
                        
                        button_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
                        button_1.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent arg0) {
                        	}
                        });
                        button_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
                        panel.add(button_1);
                        
                                // Submit
                        
                                submit = new JButton("\uB85C\uADF8\uC778");
                                submit.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
                                panel.add(submit);
                                
                                // Adding the listeners to components..
                                submit.addActionListener(this);
                        message = new JLabel();
                        message.setHorizontalAlignment(SwingConstants.CENTER);
                        message.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
                        panel.add(message);
        setTitle("login");
        setSize(600, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String id = userName_text.getText().toString();
        String pw = password_text.getText().toString();
        logindb logdb = new logindb();
        int result = logdb.checkIDPW(id, pw);
        if (result == 0) { message.setText(" æ»≥Á«œººø‰ " + id
                + "¥‘");
    } else {
        message.setText(" πÃµÓ∑œ ªÁøÎ¿⁄¿‘¥œ¥Ÿ. ");
    }
    }
}