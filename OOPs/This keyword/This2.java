public class This2 {
    /*int age;
    This2(int age){
        age = age;
    }
    public static void main(String[] args) {
      
    This2 t  = new This2(10);
    System.out.println(t.age);
    */

    // now we are using this keyword

    int age;
    This2(int age){
        this.age = age;
    }
    public static void main(String[] args) {
        This2 t  = new This2(24);
        System.out.println(t.age);
    }
}
