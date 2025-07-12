import java.util.Scanner;

public class dollar_converter {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the rupee amount: ");
    float rupee= sc.nextFloat();

    double dollar=rupee/85.8;

    System.out.println("Dollar: $"+Math.round(dollar*100)/100.0);

    sc.close();

    }
}
