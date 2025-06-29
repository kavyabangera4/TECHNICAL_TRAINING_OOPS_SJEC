import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



class DbUI extends JFrame{
    public DbUI(){
        this.setTitle("DataBase Demo");
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel lbl1=new JLabel("Query Input");
        lbl1.setBounds(50,50,90,40);
        this.add(lbl1);

        JTextArea txt=new JTextArea();
        txt.setBounds(50,100,500,100);
        this.add(txt);

        JButton btnup=new JButton("Execute Update");
        btnup.setBounds(75,230,200,40);
        this.add(btnup);

        JButton btnq=new JButton("Execute Query");
        btnq.setBounds(330,230,200,40);
        this.add(btnq);

        JLabel lbl2=new JLabel("Query Output");
        lbl2.setBounds(50,270,90,40);
        this.add(lbl2);

        JTextArea txt2=new JTextArea();
        txt2.setBounds(50,320,500,100);
        this.add(txt2);

        btnup.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     Connection con=DriverManager.getConnection("jdbc:sqlite:college.db");
                     Statement stmt=con.createStatement();

                     ResultSet rst=stmt.executeQuery(txt.getText());
                     while(rst.next()){
                        txt2.append("USN= "+rst.getInt("usn")+"\n");
                        txt2.append("Name= "+rst.getString("name")+"\n");
                        txt2.append("Marks= "+rst.getFloat("marks")+"\n");
                     }
             }catch(Exception e){
                System.out.println(e);
             }
            }
                
        });
        btnq.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                Connection con=DriverManager.getConnection("jdbc:sqlite:college.db");
               Statement stmt=con.createStatement(); 
               txt2.setText("");
               ResultSet rst=stmt.executeQuery(txt.getText());
               while(rst.next()){
                for(int i=1;i<=rst.getMetaData().getColumnCount();i++){
                    txt2.append(rst.getMetaData().getColumnName(i)+" ");
                     txt2.append("="+rst.getString(rst.getMetaData().getColumnName(i))+" ");
                }
                txt2.append("\n");
               }
                }catch(Exception e){
                    System.out.println(e);
                }
}       
                
        });
        this.setVisible(true);
    }
}
public class DbDemo {
    public static void main(String[] args) {
    new DbUI();
}
}
