package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    JButton view, add, update, remove;

    Home() {
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT); 
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1300, 800); 
        add(image);

        JLabel heading = new JLabel("WELCOME BACK!");
        heading.setBounds(830, 20, 400, 40); 
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        heading.setForeground(Color.BLACK);
        image.add(heading);

        int buttonWidth = 200;
        int buttonHeight = 60;

        add = new JButton("Add Employee");
        add.setBounds(750, 80, buttonWidth, buttonHeight); 
        add.addActionListener(this);
        image.add(add);

        view = new JButton("View Employees");
        view.setBounds(950, 80, buttonWidth, buttonHeight); 
        view.addActionListener(this);
        image.add(view);

        update = new JButton("Update Employee");
        update.setBounds(750, 150, buttonWidth, buttonHeight); 
        update.addActionListener(this);
        image.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(950, 150, buttonWidth, buttonHeight); 
        remove.addActionListener(this);
        image.add(remove);

        setSize(1300, 800); 

        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
