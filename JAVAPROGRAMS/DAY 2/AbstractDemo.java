abstract class  calci{//abstract class must be inherited by a child class
   // abstract class can have both abstract and non-abstract methods
    abstract public double add(double op1,double op2);//absract methods should be overridden in the child class
   abstract public double subs(double op1,double op2);
    abstract public double mul(double op1,double op2);
    abstract public double div(double op1,double op2);
}

class Mycalci extends calci{
    public double add(double op1,double op2){
        return op1+op2;
    }
    public double subs(double op1,double op2){
        return op1-op2;
    }
    public double mul(double op1,double op2){
        return op1*op2;
    }
    public double div(double op1,double op2){
        return op1/op2;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Mycalci c = new Mycalci();
        System.out.println(c.add(7,8));
    }
}