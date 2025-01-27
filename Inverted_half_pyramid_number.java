import java.util.Scanner;

public class Inverted_half_pyramid_number {
    
    public static void inverted_half_pyramid(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j < n){
                    System.out.print(j+1 +" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            
            inverted_half_pyramid(n);
        }
    }
}
