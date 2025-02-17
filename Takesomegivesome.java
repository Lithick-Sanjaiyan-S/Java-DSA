class Any{
    int a=10;
    int b=5;
    String met(String name){
        return "Name is :"+name;
    }
    int add(){
        return a+b;
    }
    void retnothing(){
        System.out.println("It returns nothing");
    }
    void sub(int c){
        System.out.println("took something return nothing");
    }
        }
public class Takesomegivesome {
    public static void  main(String[] args){
        Any obj=new Any();
        obj.retnothing();
        obj.sub(15);
        System.out.println(obj.met("Lithick"));
        System.out.println(obj.add());

    }
}
