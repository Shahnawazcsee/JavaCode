class Animal{
    
    int a;
    public void my(){
        System.out.println("wow");
    }
}

class A extends Animal{

    @Override
    public void my(){
        System.out.println("the value is equal to : " + a);
    }

    // new method in subclass 
    public void bark(){
        System.out.println(" normarly made this method");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        A sc = new A();

        sc.a = 23;
        sc.my();
        sc.bark();
    }
    
}
