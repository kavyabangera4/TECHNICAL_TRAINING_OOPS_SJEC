import java.util.*;
class Student{
    int usn;
    String Name;
    float marks;
    Student(int usn,String Name,float marks){
        this.usn=usn;
        this.Name=Name;
        this.marks=marks;
    }
   void Display(){
        System.out.println(usn+" "+Name+" "+marks);
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
         System.out.println("Length="+al.size());
        al.add(new Student(101,"Kavya",67));
        al.add(new Student(102,"Alice",67));
        al.add(new Student(103,"Jenitha",67));
        // al.add("Monday");
        // al.add("Tuesday");
        // al.add("WEdnesday");
        // System.out.println("Length="+al.size());
        // al.add("Thursday");
        // al.add("Friday");
        //  System.out.println("Length="+al.size());
        //  al.remove("Tuesday");
        //   System.out.println("Length="+al.size());
        Student temp=null;
        for (Student s:al){
            if(s.usn==103){
                al.remove(s);
                break;
            }
        }
        // al.remove(temp);

          for (Student s:al){        //For Each loop
            s.Display();
          }

    }

}
