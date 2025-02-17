class TCS {
    String name;
    int age;
    String Role;

    String details(){
        return "currently working: "+this.name;
    }
    void welcome(){
        System.out.println("Welcome to TCS");
    }
    void TCS(){
        System.out.println("Its TCS!");;
    }
    void TCS(String venue){
        System.out.println("VENUE :"+venue);;
    }

}
public class Employee{
    public static void main(String[] args){
        TCS emp1=new TCS();
        emp1.welcome();
        emp1.name="gowrav";
        emp1.TCS();
        emp1.TCS("Bangalore");
        System.out.println(emp1.details());
    }
}
