import javafx.scene.control.RadioButton;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
/**
 * @author Marwa N. Jarada
 */

public class Printer extends JFrame {


    JTextField printerTxt;

    //Buttons:
    Button okBtn;
    Button setUpBtn;
    Button cancelBtn;
    Button helpBtn;
    ButtonGroup buttonGroup;

    //Panels:
    JPanel buttonsPanel;
    JPanel centerPanel;
    JPanel bottomPanel;

    //CheckBox:
    JCheckBox imageCheckBox;
    JCheckBox textCheckBox;
    JCheckBox codeCheckBox;

    //RadioButtones:
    JRadioButton selectionRBtn;
    JRadioButton allRBtn;
    JRadioButton appletRBtn;

    //ComboBox:
    JComboBox<String> qualityComboBox;
    JCheckBox printFile;

    //Labels:
    JLabel printQuality;



    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.setjFrame();



    }

    public void setjFrame(){

        //Properities:
        String setUp = "Setup..";
        String ok = "Ok";
        String cancel = "Cancel";
        String help = "Help";
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 200);
        this.setResizable(true);
        this.setTitle("Printer");
        this.setLayout(new FlowLayout());
        centerPanel=new JPanel(new GridLayout(3,2));
        imageCheckBox=new JCheckBox("Image");
        textCheckBox=new JCheckBox("Text");
        codeCheckBox=new JCheckBox("Code");


        JPanel borderLayout=new JPanel(new BorderLayout());
        //Center JPanel:
        buttonGroup= new ButtonGroup();
        selectionRBtn=new JRadioButton("Selection");
        allRBtn=new JRadioButton("All");
        appletRBtn=new JRadioButton("aplet");
        buttonGroup.add(selectionRBtn);
        buttonGroup.add(allRBtn);
        buttonGroup.add(appletRBtn);
        centerPanel.add(imageCheckBox);
        centerPanel.add(selectionRBtn);
        centerPanel.add(textCheckBox);
        centerPanel.add(allRBtn);
        centerPanel.add(codeCheckBox);
        centerPanel.add(appletRBtn);
        borderLayout.add(centerPanel, BorderLayout.CENTER);


        //BottomJPanel:
        bottomPanel=new JPanel(new GridLayout(1,3));
        printQuality=new JLabel("Printer Quality");
        qualityComboBox=new JComboBox<>();
        qualityComboBox.addItem("Hight");
        qualityComboBox.addItem("Little");
        qualityComboBox.addItem("Low");
        qualityComboBox.setSelectedIndex(0);
        printFile=new JCheckBox();
        printFile.setText("Print To File");
        bottomPanel.add(printQuality);
        bottomPanel.add(qualityComboBox);
        bottomPanel.add(printFile);
        borderLayout.add(bottomPanel,BorderLayout.SOUTH);
        this.add(borderLayout);

        //Right JPanel
        buttonsPanel=new JPanel(new GridLayout(4,1,5,10));
        okBtn= new Button();
        setUpBtn = new Button();
        cancelBtn = new Button();
        helpBtn = new Button();
        okBtn.setLabel(ok);
        cancelBtn.setLabel(cancel);
        helpBtn.setLabel(help);
        setUpBtn.setLabel(setUp);
        buttonsPanel.add(okBtn);
        buttonsPanel.add(cancelBtn);
        buttonsPanel.add(setUpBtn);
        buttonsPanel.add(helpBtn);
        this.add(buttonsPanel);

        this.setVisible(true);



    }


    }
