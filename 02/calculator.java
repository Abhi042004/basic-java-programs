import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        float a=sc.nextFloat();

        System.out.println("Enter second number: ");
        float b=sc.nextFloat();
        
        System.out.println("Enter the operation ( + , - , * , / )");
        String op=sc.next();

        calc(a , b , op);
        sc.close();

    }

    static void calc(float a , float b ,String op) {
        
        switch (op) {
            case "+":
                System.out.println(a+" + "+b+"= "+(a+b));
                break;
            case "-":
                System.out.println(a+" - "+b+"= "+(a-b));
                break;
            case "*":
                System.out.println(a+" * "+b+"= "+(a*b));
                break;
            case "/":
                if (b==0) {
                    System.out.println("Division by ZeroError");
                }
                System.out.println(a+" / "+b+"= "+(a/b));
                break;
        
            default:
                System.out.println("Please enter a valid operator");
                break;
        }
    }
}