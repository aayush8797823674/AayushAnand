import java.util.*;

public class inverted_star_pattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            for(int i= n; i>=0 ; i--){
                for(int j =i; j>0 ; j--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
