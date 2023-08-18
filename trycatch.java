public class trycatch {
    public static void main(String[] args) {
        int a= 600;
        int b= 0;
        //without try-catch
        //System.out.println(a/b);


        // with try-catch
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("we failed to divide. Reason: ");
            System.out.println(e);
        }

        System.out.println("end of the program");
    }
}
