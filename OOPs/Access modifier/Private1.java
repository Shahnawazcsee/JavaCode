public class Private1 {
     private int a;
     int method(){
        System.out.println("hi");
        return a;
     }

    public static void main(String[] args) {
        Private1 p = new Private1();
        //p.a = 12;
        //System.out.println("result= "+ p.a);
        // OR

        int a = 12;
        System.out.println(a);

    }
    
}
