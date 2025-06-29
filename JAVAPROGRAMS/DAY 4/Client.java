import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
        public static void main(String[] args){
     try{
        Socket cs=new Socket("172.25.13.176",8888);
        System.out.println("Connected to the server");
        BufferedReader  input=new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String message=input.readLine();
        System.out.println("Message from server:"+message);

       
        cs.close();
    }catch(Exception e){
        System.out.println(e);
    }

}
}
