
public class finallyblock {
    public static void main(String[] args) {
        int a= 6;
        int b= 10;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("i am finally block of "+ b);
            }
            b--;
        }
    }
}
