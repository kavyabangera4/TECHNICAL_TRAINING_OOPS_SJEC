import javax.swing.*;
public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing Application");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*  JButton button = new JButton("Click Me");
         button.setBounds(50, 50, 100, 30);
         frame.add(button);
         JRadioButton button1 = new JRadioButton("Click Me");
         button1.setBounds(50, 50, 100, 30);
         frame.add(button1);
         JCheckBox button = new  JCheckBox("Click Me");
         button.setBounds(50, 50, 100, 30);
         frame.add(button);
        JTextField button = new   JTextField("Click Me");
        button.setBounds(50, 50, 100, 30);
        frame.add(button);
        JPasswordField button = new   JPasswordField("Click Me");
        button.setBounds(50, 50, 100, 30);
        frame.add(button);
        JLabel button = new   JLabel("Click Me");
        button.setBounds(50, 50, 100, 30);
        frame.add(button);
        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        JComboBox bx = new JComboBox(days);
        bx.setBounds(50, 100, 100, 30);
       frame.add(bx);*/
        String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       JList list = new JList(days);
       list.setBounds(50, 150, 100, 100);
       frame.add(list);
        frame.setVisible(true);
    }
}
