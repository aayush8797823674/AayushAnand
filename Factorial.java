import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();

            int fact = 1;
            for(int i = 1; i <= n ; i++){
                fact *= i;
            }
            System.out.println("Factorial of n number is : " + fact);
        }
    }
}
