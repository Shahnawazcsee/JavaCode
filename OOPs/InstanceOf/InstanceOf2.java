
interface Animal{

}
class Dog implements Animal{

}

public class InstanceOf2 {
public static void main(String[] args) {
    
    // create of an object of sub class 
    Dog d1 = new Dog();
    
    System.out.println(d1 instanceof Dog);
    System.out.println(d1 instanceof Animal);
}
    
}
