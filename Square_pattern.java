import java.util.*;
public class Square_pattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();

            System.out.println("SQUARE PATTERN :");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
