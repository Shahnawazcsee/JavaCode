public class Method {
    public static int sum(int a, int b){
        int c = a+b;
        System.out.println(c);
        
    }
    public static void main(String[] args) {
        Method  m= new Method();
        int num1 = 24;
        int num2 = 29;
        m.sum(num1,num2);
        //int result = m.sum(num1,num2);
        //System.out.println(" correct="+result);
    }
}
