class Even extends Thread{
    int n;
    Even(int n){
      this.n=n;
      start();
    }
    
public  void run(){
    System.out.println("Even"+n);     
        }
}
class OddNo extends Thread{
    int n;
    OddNo(int n){
        this.n=n;
        start();
    }
    public void run(){
        System.out.println("ODD"+n);
    }
    }

public class Main{
    public static void main(String[] args){
        
        // ds.start();  //call or use constructor
       for(int i=0;i<100;i++){
        if(i%2==0){
               Even n=new Even(i);
            //    n.start();
        }else{
            OddNo o=new OddNo(i);
            //    o.start();
        }
               
            }
        //  Main.DisplayFor();
       // Main.Displaywhile();
       
        
    }
        // public static void DisplayFor(){
        //     for(int i=0;i<100;i++){
        //         System.out.println(i);
        //     }
        // }
        
        
    }