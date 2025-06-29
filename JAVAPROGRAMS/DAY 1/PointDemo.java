class Point{
   public int x;
   public int y;
   public void setX(int x) {
      this. x = x;
   }
   public int getX() {
       return x;
   }
   public void setY(int y) {
       this.y= y;
   }
   public int getY() {
       return y;
   }
}
public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point();
        
        p1.setX(30);
        p1.setY(40);
        System.out.println("Point 1: (" + p1.x + ", " + p1.y + ")");
       
    }
}
