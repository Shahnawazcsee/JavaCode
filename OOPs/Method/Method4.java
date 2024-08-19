public class Method4 {
    private static void display(int a){
    
         System.out.println("single parameter is = "+a);
    }
    private static void display(int a, int b){
      System.out.println("double parameters are = "+a+ " and " +b);
    }

    private static void display(String a){
        System.out.println(" diff parameter is = " +a);
    }
    public static void main(String[] args) {
    display(25);
    display("Shah");
    
    }
}
