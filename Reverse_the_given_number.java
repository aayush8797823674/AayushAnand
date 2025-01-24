import java.util.*;

public class Reverse_the_given_number {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();

            int rev =0;
            while(n>0) {
                int lastDigit = n%10;
                n /= 10;
                rev = (rev*10) + lastDigit;
            }
            System.out.print("Reverse Number is: " + rev);
        }
    }
}
