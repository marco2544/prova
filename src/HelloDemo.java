import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame{

    private JPanel PannelMain;
    private JTextField textField1;
    private JButton button1;
    private JLabel messaggio;

    public HelloDemo() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(button1,textField1.getText());
                System.out.println(textField1.getText());
                messaggio.setText(textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        HelloDemo h = new HelloDemo();
        h.setContentPane(h.PannelMain);
        h.setTitle("Hello");
        h.setSize(300,400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
