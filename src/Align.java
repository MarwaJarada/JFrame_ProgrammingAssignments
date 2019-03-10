import javax.swing.*;
import java.awt.*;

/**
 * @author Marwa N. Jarada
 */
public class Align extends JFrame{
    JPanel centerJPanel;
    JPanel panel_1;
    JPanel panel_2;

    Button okBtn;
    Button cancelBtn;
    Button helpBtn;
    JLabel xLabel;
    JLabel yLabel;
    JLabel snapToGridLabel;
    JLabel showGrid;

    JTextField xtxtField;
    JTextField yTxtField;
    JCheckBox snapCheckBox;
    JCheckBox showChexkBox;


    public static void main(String[] args) {
        Align align=new Align();
        align.setjFrame();

    }



    public void setjFrame() {


        //properaties:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        this.setResizable(true);
        this.setTitle("Align");
        this.setLayout(new FlowLayout());


        //centerPanel:
        panel_1=new JPanel();
        xtxtField=new JTextField("8",5);
        xLabel=new JLabel();
        xLabel.setText("X:");
        snapToGridLabel=new JLabel("Snap tp grid ");
        snapCheckBox=new JCheckBox();
        panel_1.add(snapCheckBox);
        panel_1.add(snapToGridLabel);
        panel_1.add(xLabel);
        panel_1.add(xtxtField);

        //
        panel_2= new JPanel();
        yTxtField=new JTextField("8",5);
        yLabel=new JLabel();
        yLabel.setText("Y:");
        showChexkBox=new JCheckBox();
        showGrid=new JLabel("Show grid");
        panel_2.add(showChexkBox);
        panel_2.add(showGrid);
        panel_2.add(yLabel);
        panel_2.add(yTxtField);

        centerJPanel=new JPanel(new GridLayout(2,1));
        centerJPanel.add(panel_1);
        centerJPanel.add(panel_2);
        this.add(centerJPanel);
        //Done with center panel



        //Right panel:
        String ok = "Ok";
        String cancel ="Cancel";
        String help = "Help";
        okBtn=new Button();
        okBtn.setPreferredSize(new Dimension(70,30));
        cancelBtn=new Button();
        helpBtn=new Button();
        okBtn.setLabel(ok);
        cancelBtn.setLabel(cancel);
        helpBtn.setLabel(help);
        JPanel buttonsPanel=new JPanel(new GridLayout(3,1,0,10));
        buttonsPanel.add(okBtn);
        buttonsPanel.add(cancelBtn);
        buttonsPanel.add(helpBtn);
        this.add(buttonsPanel);
        //Done with right panel



        this.setLocationRelativeTo(null);


        this.setVisible(true);


    }
}
