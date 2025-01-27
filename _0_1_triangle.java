import java.util.Scanner;

public class _0_1_triangle {
    
    public static void bin_triangle(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(((i+j) % 2) == 0){
                    System.out.print("1 ");
                }
                else if(((i+j) % 2) != 0){
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            
            bin_triangle(n);
        }
    }
}
