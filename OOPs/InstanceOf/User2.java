import java.util.Scanner;
public class User2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the value of a = ");
        int num1 = sc.nextInt();
        
        System.out.println("enter the value of b = ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("sum of a+b = " +(num1 +num2));

    }
    
}
