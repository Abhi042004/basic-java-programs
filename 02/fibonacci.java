import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fibbonaci series generator: ");
        int x=sc.nextInt();
        fib(x);
        sc.close();
    }

    static void fib(int x) {
        int a = 0;
        int b = 1;
        int c;
        if (x==0){
            System.out.println(a);
        }
        else if (x==1){
            System.out.println(a+", "+ b);
        }
        else if(x>1){

            for (int i = 0; i < x; i++) {
                
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
                
            }
        }
        else{
            System.out.println("Enter a valid number!");
        }
    }
}
