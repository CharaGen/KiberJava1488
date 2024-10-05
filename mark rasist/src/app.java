import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {
    private JButton Button;
    private JPanel panel1;
    private JTextField textField1;
    static int num;
    public app() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(textField1.getText());
                if (userNum < num)
                    JOptionPane.showMessageDialog(null, "число то меньше");
                else if (userNum >num)
                    JOptionPane.showMessageDialog(null, "число то больше");
                else
                    JOptionPane.showMessageDialog(null, "вы угадали");

            }
        });
    }
    public static void main(String[] args) {
        num = (int)Math.floor(Math.random() * 10);
        JFrame frame = new JFrame("App");
        frame.setContentPane(new app().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
