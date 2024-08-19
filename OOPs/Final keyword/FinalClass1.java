final class FinalClass1 {
    public void display(){
        System.out.println("we are working on final class");
    }
    
}
  
// try to extends final class
class A extends FinalClass1{
    public void display(){
        System.out.println(" i think not extended final class");
    }
    public static void main(String[] args) {
        FinalClass1 fs  = new FinalClass1();
        fs.display();
    }
}