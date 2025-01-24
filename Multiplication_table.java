import java.util.*;

public class Multiplication_table {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();

            for(int i=1; i<=10 ; i++){
                System.out.println(n +" * "+ i +" = " + i*n);
            }
        }
    }
}
