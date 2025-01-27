import java.util.*;

public class Inverted_rotated_halfPyramid{

    public static void inverted_rotated_half_pyramid(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j >= ((n/2)+1)){
                    System.out.print("*");
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
            
            inverted_rotated_half_pyramid(n);
        }
    }
}