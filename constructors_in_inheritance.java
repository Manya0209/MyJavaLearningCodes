class base{
    int x;
    base(){
        System.out.println("i am base class constructor");
    }

    base(int x){
        System.out.println("i am overloaded contructor with value of x as "+x);
    }
}

class derived extends base{
    int x, y;
    derived(){
        System.out.println("i am derived class constructor");
    }

    derived(int x, int y){
        super(x);
        System.out.println("i am overloaded contructor with value of y as "+y);
    }

}

public class constructors_in_inheritance{
    public static void main(String args[]){
       // base b= new base();
       // derived d= new derived();
        derived d= new derived(12, 4);
    }
}