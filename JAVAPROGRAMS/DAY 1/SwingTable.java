import javax.swing.*;
import java.awt.event.*;
 class Myframe extends JFrame{
    public Myframe(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        // String[] columns= {"USN", "NAME", "MARKS"};
        // String[][] data={{"1", "John Doe", "85"},
        //                {"2", "Jane Smith", "90"},
        //                {"3", "Alice Brown", "78"}};
        // JTable table=new JTable(data,columns);
        // JScrollPane scrollPane = new JScrollPane(table);
        // scrollPane.setBounds(50, 50, 400, 300);
        // this.add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem item1 = new JMenuItem("Open");
         JMenuItem item2 = new JMenuItem("Save");
          JMenuItem item3 = new JMenuItem("Save As");
           JMenuItem item4 = new JMenuItem("Close");
           file.add(item1);
           file.add(item2); 
              file.add(item3);
              file.add(item4);
        JMenu edit=new JMenu("Edit");
        JMenuItem itm1 = new JMenuItem("Undo");
        JMenuItem itm2 = new JMenuItem("Cut");
        JMenuItem itm3 = new JMenuItem("Copy");
        JMenuItem itm4 = new JMenuItem("Paste");
            edit.add(itm1);
            edit.add(itm2); 
            edit.add(itm3);
            edit.add(itm4);
        menuBar.add(file);
        menuBar.add(edit);
        this.setJMenuBar(menuBar);

        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
JOptionPane.showMessageDialog(null,);
            }
            
        });

         this.setVisible(true);
}
 }
public class SwingTable {
    public static void main(String[] args){
Myframe frame = new Myframe();
        
    }
}
