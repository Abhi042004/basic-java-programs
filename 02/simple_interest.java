import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        
         simpleInterest();
    }

    static void simpleInterest() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal amount: ");
         float p=sc.nextFloat();
         System.out.println("Enter the rate: ");
         int r=sc.nextInt();
         System.out.println("Enter the time in years: ");
         float t=sc.nextFloat();
         float ans=(p*r*t)/100;
         System.out.println("Simple Interest would be "+ ans );
         sc.close();
    }
}
