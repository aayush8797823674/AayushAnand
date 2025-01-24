import java.util.*;

public class Sum_of_natural_number {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            int i = 1;
            int Sum = 0;

            while (i<=n){
                Sum += i;
                i+=1;
            }
            System.out.println("Sum is : " + Sum);
        }
    }
}
