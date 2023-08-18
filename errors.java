import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
        //syntax error demo
        //int a= 0 //no semicolon
        //b=8 //not declared

        //logical error demo
        //print prime no 1-10
       /*  System.out.println("2");
        for(int i=1; i<5; i++){
            System.out.println(2*i+1);     //print 9 also
        } */

        //runtime error or exception
        int k;
        Scanner sc= new Scanner(System.in);
        k= sc.nextInt();
        System.out.println(1000/k); //exception when 0 is the input
    }
}
