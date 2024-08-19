public class Method3 {
    public static void sum(int a, int b){
        System.out.println("with parameter sum = "+(a+b));
    }
    public static void sum2(){
        System.out.println("without parameter");
    }
    public static void main(String[] args) {
        Method3 m = new Method3();
        m.sum(20,20);
        m.sum2();
    }
}
