import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        int max=who_is_bigger(a , b);
        System.out.println("Maximum number is: "+max);

        sc.close();
    }

    static int who_is_bigger(int a, int b) {
        return Math.max(a, b);
    }
}
