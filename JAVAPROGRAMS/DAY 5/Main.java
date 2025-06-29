import sjec.student.student;
import sjec.teacher.teacher;
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        student s=new student();
        teacher t=new teacher();
        t.display();
        s.display();
    }
}
