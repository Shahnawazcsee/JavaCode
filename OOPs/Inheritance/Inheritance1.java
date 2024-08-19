class Animal{
    String name;
    public void eat(){
        System.out.println("animal can eat");
    }
}

// inherite fromm animal
class A extends Animal{
 
    // new method in subclass
    public void display(){
        System.out.println("my name is = " +name);
    }

}


class Inheritance1{
    public static void main(String[] args) {

        // object created of subclass
        A sc = new A();

        // access field of super class
        sc.name = "Shahnawaz";
        sc.display();

        // call method of superclass using object of subclass
        sc.eat();

    }

}