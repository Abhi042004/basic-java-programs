import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check wheather it is armstrong or not:");
        int num=sc.nextInt();
        int original=num;
        int sum=0,rem;
        int digits= String.valueOf(num).length();
        
        while(num>0){
            rem = num % 10;
            sum += Math.pow(rem, digits);
            num = num/10;
        }
        
        if (sum==original){
            System.out.println(original + " is a armstrong number");
        }
        else {
            System.out.println(original + " is not a armstrong number");
        }
 
        sc.close();
    }
}
