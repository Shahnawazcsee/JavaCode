public class Protected1{
    protected void display(){
        System.out.println(" i am shahnawaz");
    }
}
 class Md extends Protected1{
    public static void main(String[] args) {
        Md m  = new Md();
        m.display();
    
    }
 }