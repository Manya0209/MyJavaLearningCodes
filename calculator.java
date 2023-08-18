import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        float num_1, num_2;
        System.out.println("enter first number");
        Scanner scan= new Scanner(System.in);
        num_1= scan.nextFloat(); 
        
        System.out.println("enter second number");
        Scanner scan2= new Scanner(System.in);
        num_2= scan.nextFloat();

        System.out.print("you have entered ");
        System.out.print(num_1);
        System.out.print(" and ");
        System.out.println(num_2);

        String prompt= "enter 0 for addition, 1 for subtraction, 2 for multiplication, 3 for division";
        System.out.println(prompt);
        int input= scan.nextInt();

        switch(input){
            case 0:
              System.out.println("adding these numbers ");
              System.out.print("result is ");     
              System.out.println(num_1 + num_2);  
              break;   
              
            case 1:
              System.out.println("subtracting these numbers ");
              System.out.print("result is ");     
              System.out.println(num_1 - num_2);  
              break;   
              
            case 2:
              System.out.println("multiplying these numbers ");
              System.out.print("result is ");     
              System.out.println(num_1 * num_2);  
              break;   
              
            case 3:
              System.out.println("dividing these numbers ");
              System.out.print("result is ");     
              System.out.println(num_1 / num_2);  
              break;  
              
            default:
            System.out.println("invalid input");
        }
    }
}