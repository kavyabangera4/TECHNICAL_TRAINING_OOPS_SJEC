public class StaticDEmo {
    int x;
    public static void main(String[] args) {
        StaticDEmo s1 = new StaticDEmo();
        StaticDEmo s2 = new StaticDEmo();
        s1.x = 10; // Instance variable for s1
        System.out.println("s1="+s1.x);
        System.out.println("s2="+s2.x);
        s2.x=20;
        System.out.println("s1="+s1.x);
        System.out.println("s2="+s2.x);
    }
}