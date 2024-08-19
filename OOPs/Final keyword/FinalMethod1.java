public class FinalMethod1 {
    
    public final void display(){
    System.out.println("this is only final method");
        
    }
    
}

class A extends FinalMethod1{
// try to override final method
    
    public final void display(){
System.out.println("final method is overridden");
    }

    public static void main(String[] args) {
        FinalMethod1 fm = new FinalMethod1();
        fm.display();
    }
}