import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class AwtApp extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField tf1, tf2, tf5, tf6, tf7;
    JButton btn1, btn2;
    JTextField tf3;
    JTextField tf4;

    AwtApp() {
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Loan Application Form");
        l1 = new JLabel("Loan Application in Windows Form:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Name:");
        l7 = new JLabel("Account Number");
        l5 = new JLabel("Branch Name/Code");
        l4 = new JLabel("Ifsc Code");
        l6 = new JLabel("Credit Score");
        l3 = new JLabel("Loan Amount:");
        l8 = new JLabel("Phone No:");
        l9 = new JLabel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        l9.setBounds(80, 410, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        tf4.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        btn1.setBounds(50, 350, 100, 30);
        btn2.setBounds(170, 350, 100, 30);
        add(l1);
        add(l2);
        add(l9);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(tf3);
        add(l5);
        add(tf4);
        add(l6);
        add(tf5);
        add(l7);
        add(tf6);
        add(l8);
        add(tf7);
        add(btn1);
        add(btn2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            String name = tf1.getText();
            String loan = tf2.getText();
            String ifsc = tf3.getText();
            String branch = tf4.getText();
            String accno = tf5.getText();
            String score = tf6.getText();
            String phone = tf7.getText();
            String path = "C:\\Loan.txt";
            File file = new File(path);
            try {
                FileWriter fw = new FileWriter(file, true);
                fw.write("Name:" + name + "\n");
                fw.write("Loan Amount:" + loan + "\n");
                fw.write("Ifsc Code:" + ifsc + "\n");
                fw.write("Branch Name/Code:" + branch + "\n");
                fw.write("Account Number:" + accno + "\n");
                fw.write("Credit Score:" + score + "\n");
                fw.write("Phone No:" + phone + "\n");
                fw.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Data Saved");
        }
        if (e.getSource() == btn2) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
        }
    }

    public static void main(String args[]) {
        new AwtApp();

    }
}
