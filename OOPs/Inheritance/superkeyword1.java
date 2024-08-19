class Animal{
    String name;
    public void my(){
        System.out.println("wow ");
    }
}
class A extends Animal{
    
    public void my(){
    super.my();
    System.out.println("hello ji " +name);
}
      public void bark(){
        System.out.println("alright ");
      }
}   

public class superkeyword1 {
    public static void main(String[] args) {
        A sc  = new A();

        sc.name = " java ";
        sc.my();
        sc.bark();
    }
    
}
