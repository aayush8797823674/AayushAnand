import java.util.*;

public class Star_pattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();

            for(int i= 0; i<n ; i++){
                for(int j =0; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
