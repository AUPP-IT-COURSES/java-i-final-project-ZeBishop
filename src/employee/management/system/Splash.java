package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {

    private JLabel heading;
    private Timer timer; 

    Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        heading = new JLabel("EMPLOYEE INFORMATION SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.BLACK);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.png"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton clickhere = new JButton("START WORKING");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.BLACK);
        clickhere.addActionListener(this);
        image.add(clickhere);

        timer = new Timer(500, new ActionListener() {
            private boolean isVisible = true;
            private int blinkCount = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                heading.setVisible(isVisible);

                if (++blinkCount >= 5) {
                    timer.stop();
                    heading.setForeground(Color.BLACK);
                }

                isVisible = !isVisible;
            }
        });
        timer.start();

        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        timer.stop(); 
        new Login();
    }

    public static void main(String args[]) {
        new Splash();
    }
}
