import javax.swing.*;
import java.awt.event.*;
public record SwingCalc() {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULATOR");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField txt1 = new JTextField("");
        txt1.setBounds(50, 50, 235, 30);
        frame.add(txt1);

        final int[] firstOperand = new int[1];
        final String[] operator = new String[1];

        JButton btn1= new JButton("7");
         btn1.setBounds(50, 100, 50, 30);
         frame.add(btn1);
         JButton btn2= new JButton("8");
         btn2.setBounds(110, 100, 50, 30);
         frame.add(btn2);
         JButton btn3= new JButton("9");
         btn3.setBounds(170, 100, 50, 30);
         frame.add(btn3);
         JButton btn4= new JButton("/");
         btn4.setBounds(230, 100, 50, 30);
         frame.add(btn4);

            JButton btn5= new JButton("4");
         btn5.setBounds(50, 150, 50, 30);
         frame.add(btn5);
         JButton btn6= new JButton("5");
         btn6.setBounds(110, 150, 50, 30);
         frame.add(btn6);
         JButton btn7= new JButton("6");
         btn7.setBounds(170, 150, 50, 30);
         frame.add(btn7);
         JButton btn8= new JButton("*");
         btn8.setBounds(230, 150, 50, 30);
         frame.add(btn8);
         
        JButton btn9= new JButton("1");
         btn9.setBounds(50, 200, 50, 30);
         frame.add(btn9);
         JButton btn10= new JButton("2");
         btn10.setBounds(110, 200, 50, 30);
         frame.add(btn10);
         JButton btn11= new JButton("3");
         btn11.setBounds(170, 200, 50, 30);
         frame.add(btn11);
         JButton btn12= new JButton("-");
         btn12.setBounds(230, 200, 50, 30);
         frame.add(btn12);

         JButton btn13= new JButton("0");
         btn13.setBounds(50, 250, 50, 30);
         frame.add(btn13);
         JButton btn14= new JButton("C");
         btn14.setBounds(110, 250, 50, 30);
         frame.add(btn14);
         JButton btn15= new JButton("=");
         btn15.setBounds(170, 250, 50, 30);
         frame.add(btn15);
         JButton btn16= new JButton("+");
         btn16.setBounds(230, 250, 50, 30);
         frame.add(btn16);

        btn1.addActionListener(e -> txt1.setText(txt1.getText() + "7"));
btn2.addActionListener(e -> txt1.setText(txt1.getText() + "8"));
btn3.addActionListener(e -> txt1.setText(txt1.getText() + "9"));
btn5.addActionListener(e -> txt1.setText(txt1.getText() + "4"));
btn6.addActionListener(e -> txt1.setText(txt1.getText() + "5"));
btn7.addActionListener(e -> txt1.setText(txt1.getText() + "6"));
btn9.addActionListener(e -> txt1.setText(txt1.getText() + "1"));
btn10.addActionListener(e -> txt1.setText(txt1.getText() + "2"));
btn11.addActionListener(e -> txt1.setText(txt1.getText() + "3"));
btn13.addActionListener(e -> txt1.setText(txt1.getText() + "0"));

// For "+" button
btn16.addActionListener(e -> {
    firstOperand[0] = Integer.parseInt(txt1.getText());
    operator[0] = "+";
    txt1.setText("");
});
// ...existing code...

// For "-" button
btn12.addActionListener(e -> {
    firstOperand[0] = Integer.parseInt(txt1.getText());
    operator[0] = "-";
    txt1.setText("");
});

// For "*" button
btn8.addActionListener(e -> {
    firstOperand[0] = Integer.parseInt(txt1.getText());
    operator[0] = "*";
    txt1.setText("");
});

// For "/" button
btn4.addActionListener(e -> {
    firstOperand[0] = Integer.parseInt(txt1.getText());
    operator[0] = "/";
    txt1.setText("");
});

// For "=" button
btn15.addActionListener(e -> {
    int secondOperand = Integer.parseInt(txt1.getText());
    int result = 0;
    switch (operator[0]) {
        case "+": result = firstOperand[0] + secondOperand; break;
        case "-": result = firstOperand[0] - secondOperand; break;
        case "*": result = firstOperand[0] * secondOperand; break;
        case "/":
            if (secondOperand != 0) {
                result = firstOperand[0] / secondOperand;
            } else {
                txt1.setText("Error");
                return;
            }
            break;
        default: txt1.setText("Error"); return;
    }
    txt1.setText(String.valueOf(result));
});
btn15.addActionListener(e -> {
    int secondOperand = Integer.parseInt(txt1.getText());
    int result = 0;
    if ("+".equals(operator[0])) {
        result = firstOperand[0] + secondOperand;
    }
    txt1.setText(String.valueOf(result));
});


btn14.addActionListener(e -> txt1.setText(""));
         frame.setVisible(true);
    }
}


