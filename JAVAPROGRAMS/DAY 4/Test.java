import java.io.*;
public class Test {
    public static void main(String[] args) throws IOException{
        PrintWriter output=new PrintWriter(System.out,true);    //Instead of System.out.println
        output.println("Enter Your Name:");
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));  //Instead of Scanner
        String message=input.readLine();
        output.println("You typed:"+message);
    }
}
