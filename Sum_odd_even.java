import java.util.*;

public class Sum_odd_even {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int oddSum = 0;
            int evenSum = 0;

            System.out.print("Enter integer (Enter 0 to Stop) : ");
            while (true) { 
                int n = sc.nextInt();
                if(n == 0){
                    break;
                }
                else if(n %2 == 0){
                    evenSum += n;
                }
                else{
                    oddSum += n;
                }
            }
            System.out.println("Sum of Even Number is : "+ evenSum);
            System.out.println("Sum of Odd Number is : "+ oddSum);
        }
    }
}
