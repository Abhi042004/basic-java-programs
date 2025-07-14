import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input a single word:");
        String text=sc.next();
        boolean is_palindrome=palindrone_Checker(text);
        System.out.println("Is the given word a palindrome: "+is_palindrome);
        sc.close();
    }

    static boolean palindrone_Checker(String text) {
        boolean ans = false;
        String rev="";
        
        for (int i = text.length()-1; i >= 0 ; i--) {
            char letter=text.charAt(i);
            rev+=letter;
        }

        if (rev.equals(text)) {
            ans=true;
        }
        return ans;
    }
}
