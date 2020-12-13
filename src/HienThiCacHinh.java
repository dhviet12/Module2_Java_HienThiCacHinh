import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        if( number == 1){
            System.out.println("Enter height");
            int height = input.nextInt();
            System.out.println("Enter width");
            int width = input.nextInt();
            for (int i = 0; i < height; i++) {
                System.out.println("");
                for (int j = 0; j < width; j++) {
                    System.out.print("***");
                }
                
            }
        } else if(number ==2){
            System.out.println("Enter height: ");
            int height1= input.nextInt();
            for (int i = 0; i <= height1 ; i++) {
                System.out.println("");
                for (int j = 0; j < i ; j++) {
                    System.out.print("*");
                }
            }
        } else if(number ==3){
            System.out.println("Enter height: ");
            int height3= input.nextInt();
            for (int i = 0; i < height3; i++) {
                for (int j = 0; j < height3-i ; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k < i*2 ; k++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
