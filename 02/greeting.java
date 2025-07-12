import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name=sc.next();
        greet(name);
        sc.close();
    }

    static void greet(String name) {
        System.out.println("Hello "+ name + ", welcome to paradise");
    }
}
