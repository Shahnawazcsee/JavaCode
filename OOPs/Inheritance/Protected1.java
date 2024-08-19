class Animal{
     protected String name;
     protected void my(){
        System.out.println(" wow protected used");
     }
}
 
class A extends Animal{
    public void yes(){
        System.out.println(" alright");
    }
}

public class Protected1 {
    public static void main(String[] args) {
        A sc = new A();

        sc.name = "java";
        sc.my();
        sc.yes();
    }
    
}
