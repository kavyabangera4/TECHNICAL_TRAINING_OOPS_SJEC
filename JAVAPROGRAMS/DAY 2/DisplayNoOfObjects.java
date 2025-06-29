public class DisplayNoOfObjects {
    static int count=0; 
    public DisplayNoOfObjects(){
        count++;
    }// Static variable to keep track of the number of objects
    public static void Display() {
        System.out.println("Number of objects created: " + count);
    }
    public static void main(String[] args) {

            // DisplayNoOfObjects obj1 = new DisplayNoOfObjects();
            // // obj1.Display();
            // DisplayNoOfObjects obj2 = new DisplayNoOfObjects(); 
            // // obj2.Display();
            for (int i=0;i<10;i++){
                new DisplayNoOfObjects();
                // Display the count of objects created
    }
    DisplayNoOfObjects.Display();
}
}
