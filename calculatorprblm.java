package calc;

class calculator{
    public void calculate(int a, int b){
        System.out.println(a+b);
    }
}

class Sccalculator{
    public void calculate(int a, int b){
        System.out.println(Math.sin(a+b));
    }
}
class Hycalculator{
    public void calculate(int a, int b){
        System.out.println(a+b);
        System.out.println(Math.sin(a+b));
    }
}


public class calculatorprblm {
    public static void main (String [] args){
        System.out.println("i am main method");
    }
}
