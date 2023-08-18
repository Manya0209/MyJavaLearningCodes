interface sampleinterface{
    void meth1();
}
interface childsampleinterface extends sampleinterface{
    void meth2();
}
class mysample implements childsampleinterface{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}

public class interfaces {
    public static void main (String[] args){
        mysample obj = new mysample();
        obj.meth1();      
        obj.meth2();      
    }
}
