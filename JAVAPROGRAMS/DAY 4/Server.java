import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
    public static void main(String[] args) {
        try{
        ServerSocket s=new ServerSocket(8888);
        System.out.println("server Started"); 
        Socket cs=s.accept();
        System.out.println("Client is connected");
        PrintWriter output=new PrintWriter(cs.getOutputStream(),true);
       output.println("Hello World");
        s.close();
    }catch(Exception e){

    }
   
}
}
