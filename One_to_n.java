import java.util.*;

public class One_to_n {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number:");
            int n = sc.nextInt();
            int i = 1;

            while (i<=n){
                System.out.println(i);
                i+=1;
            }
        }
    }
}
