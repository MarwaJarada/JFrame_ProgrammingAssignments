
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author Marwa N. Jarada
 */
public class CalcPanel extends JFrame{
    private JPanel keysPanel;
    private JButton[] keysButtons;
    private JTextField textFieldLCD;

    public void setJFrame() {
        setSize(300, 300);
        setTitle("Calculator");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keysPanel = new JPanel(new GridLayout(4,4,10,10));
        keysButtons = new JButton[16];
        for(int i=0; i<=2; i++) {
            keysButtons[i] = new JButton(String.valueOf(i+7));
        }
        keysButtons[3] = new JButton("/");
        for(int i=4; i<=6; i++) {
            keysButtons[i] = new JButton(String.valueOf(i));
        }
        keysButtons[7] = new JButton("*");
        for(int i=8; i<=10; i++) {
            keysButtons[i] = new JButton(String.valueOf(i-7));
        }
        keysButtons[11] = new JButton("-");
        keysButtons[12] = new JButton("0");
        keysButtons[13] = new JButton(".");
        keysButtons[14] = new JButton("=");
        keysButtons[15] = new JButton("+");
        for(JButton button:keysButtons){
            button.setFont(new Font("Serif", Font.BOLD, 14));
            keysPanel.add(button);
        }
        textFieldLCD = new JTextField("LCD");
        textFieldLCD.setFont(new Font("Arial", Font.BOLD, 18));
        textFieldLCD.setForeground(Color.red);
        setLayout(new BorderLayout());

        add(textFieldLCD, BorderLayout.NORTH);
        add(keysPanel,BorderLayout.CENTER);
        setVisible(true);
    }


    public static void main(String[] args) {
        CalcPanel calcPanel=new CalcPanel();
        calcPanel.setJFrame();
    }

}
