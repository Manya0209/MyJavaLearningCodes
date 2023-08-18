class phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void on(){
        System.out.println("turning on phone...");
    }
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("apka swagat hai");
    }
    @Override
    public void on(){
        System.out.println("turning on smartphone...");
    }
}


public class dynamic_method_dispatch {
  public static void main (String args[]){
    phone obj= new smartphone();
   // smartphone obj2= new phone(); //not allowed
    obj.greet();
    obj.on();
    //obj2.on();
    //obj.swagat(); not allowed
  }  
}
