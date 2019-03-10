import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
/**
 * @author Marwa N. Jarada
 */

public class MultipleSelectionList extends JFrame {
    JButton copyBtn;
    JTextArea txtArea;
    JList<String> list;



    public static void main(String[] args){
        MultipleSelectionList list=new MultipleSelectionList();
        list.setMultipleSelectionListJFrame();

    }


    public void setMultipleSelectionListJFrame(){

        this.setTitle("Multiple Selection Lists");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(400,200);
        this.setLayout(new FlowLayout());
        String[] myList={"Black","Blue","Cyan","Dark Grary","Gray","Blasck","Blue","Cyan","Dark Grary","Gray"};
        list=new JList(myList);
        list.setSelectedIndex(0);
        list.setPreferredSize(new Dimension(60,100));
        JScrollPane scrollPane=new JScrollPane(list);
        this.add(scrollPane);
        copyBtn=new JButton("Copy >>");
        txtArea=new JTextArea("Black\nCyan\nGray");
        txtArea.setPreferredSize(new Dimension(100,100));

        this.add(list);
        this.add(copyBtn);
        this.add(txtArea);

        this.setVisible(true);


    }

}
