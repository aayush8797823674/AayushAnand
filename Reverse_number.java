import java.util.*;

public class Reverse_number {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();

            System.out.print("Reverse Number is: ");
            while(n>0) {
                int lastDigit = n%10;
                n /= 10;
                System.out.print(lastDigit);
            }
        }
    }
}
