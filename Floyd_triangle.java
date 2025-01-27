import java.util.Scanner;

public class Floyd_triangle {

    public static void floid_triangle(int n){

        int k = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            
            floid_triangle(n);
        }
    }
}
