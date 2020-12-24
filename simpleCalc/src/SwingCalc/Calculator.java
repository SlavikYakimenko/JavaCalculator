package SwingCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel label1, label2, result;
    private JTextField t1, t2;
    private JButton add, sub, mul, div;

    MyFrame() {
        setTitle("Simple calculator");
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("First number: ");
        label1.setBounds(10, 20, 100, 20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(120, 20, 150, 20);
        c.add(t1);

        label2 = new JLabel("Second number: ");
        label2.setBounds(10, 50, 100, 20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(120, 50, 150, 20);
        c.add(t2);


        add = new JButton("+");
        add.setBounds(10, 80, 50, 30);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(80, 80, 50, 30);
        c.add(sub);


        mul = new JButton("*");
        mul.setBounds(150, 80, 50, 30);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(220, 80, 50, 30);
        c.add(div);

        result = new JLabel("Result is: ");
        result.setBounds(10, 120, 100, 20);
        c.add(result);

        //
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);


        setVisible(true);
    }

    @Test
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == add) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                result.setText("Result is : " + c);
            }


            if (e.getSource() == sub) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                result.setText("Result is : " + c);
            }
            if (e.getSource() == mul) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                result.setText("Result is : " + c);
            }
            if (e.getSource() == div) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                result.setText("Result is : " + c);
            }
        } catch (NumberFormatException e1) {
            result.setText("Numbers only");
        } catch (ArithmeticException e2) {
            result.setText("Cannot divide by zero");
        }
    }

}

class SimpleCalc {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }
}
