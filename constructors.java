class myemployee {
    private int id;
    private String name;

    public myemployee(){
        id=0;
        name= "your-name";
    }

    public myemployee(int myid, String myname){
        id= myid;
        name= myname;
    }

    public myemployee(String myname){
        id= 1;
        name= myname;
    }

    public int getid(){return id;}
    public String getname(){return name;}
}

public class constructors{
    public static void main(String args[]){
        myemployee rohan= new myemployee(12, "chillwithrohan");
        System.out.println(rohan.getid());
        System.out.println(rohan.getname());
    }
}
