class mydeprecate{
    @Deprecated
    void meth1(){
        System.out.println("meth1");
    }
}

public class deprecate {
    public static void main(String[] args) {
        mydeprecate d= new mydeprecate();
        d.meth1(); 
    }
}
