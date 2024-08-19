class Cat{
   String str;
   String s;
   void barking(){
    str = "Shahnawaz";
    s = "my";
    System.out.println(" everything is right??");
    System.out.println("wow:"+ s);
    System.out.println("Animal is eating:"+str);
   System.out.println("u r great");
   }
   
}


public class Demo{
    public static void main(String[] args) {
        Cat c = new Cat();
         c.str = "Shah";
        // c.barking();
        System.out.println(" it is ok: "+c.str);
       c.barking();
    }
}