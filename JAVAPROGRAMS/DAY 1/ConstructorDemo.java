class A{
    A() {
        System.out.println("A's constructor");
    }
}
class B extends A {
    B() {
        System.out.println("B's constructor");
    }
}
class C extends B {
    C() {
        System.out.println("C's constructor");
    }
}
public class ConstructorDemo {
    public static void main(String[] args){
        int x=10;
        int y=0;
        try {
            int z=x/y;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } 
    }
}
