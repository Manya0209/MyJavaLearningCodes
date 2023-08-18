class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is " + id);
        System.out.println("and my name is " + name);
    }
}

public class customclass {
    public static void main (String args[]){
        employee rohan = new  employee();
        rohan.id= 12;
        rohan.name= "chillwithrohan";
        System.out.println(rohan.id);
        System.out.println(rohan.name);
        rohan.printdetails();
    }
}
