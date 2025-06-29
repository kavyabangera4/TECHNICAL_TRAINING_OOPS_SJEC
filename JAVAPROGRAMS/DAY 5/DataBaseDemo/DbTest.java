import java.sql.*;
public class DbTest{
    public static void main(String[] args) {
        try{
            Connection con=DriverManager.getConnection("jdbc:sqlite:college.db");
            System.out.println("DB Connection opened");
            Statement stmt=con.createStatement();
            // stmt.executeUpdate("create table student1(usn int ,name string, marks float)");
            stmt.executeUpdate("insert into student1 values(101,'Kavya',67)");
            stmt.executeUpdate("insert into student1 values(102,'Jenitha',95)");
            stmt.executeUpdate("insert into student1 values(103,'Chaithanya',57)");
            stmt.executeUpdate("update student1 set marks=99 where usn=102");
            stmt.executeUpdate("delete from student1 where usn=101");
            ResultSet rst=stmt.executeQuery("select usn,name,marks from student1");
            while(rst.next()){
                System.out.println("USN= "+rst.getInt("usn"));
                System.out.println("Name= "+rst.getString("name"));
                System.out.println("Marks= "+rst.getFloat("marks"));
            }
            con.close();
            System.out.println("DB Connection closed");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
