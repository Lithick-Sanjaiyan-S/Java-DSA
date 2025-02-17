import java.util.Scanner;
public class SalaryofEmp {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter gender:");
        String gender=inp.nextLine();
        System.out.println("Enter years of Service:");
        int yrs=inp.nextInt();
        System.out.println("Enter education");
        Scanner inp1=new Scanner(System.in);
        String edu=inp1.nextLine();

        if (gender.toLowerCase().equals("male")){
            if (yrs >= 10){
                if (edu.toLowerCase().equals("pg")){
                    System.out.println("your salary is 15000");
                }else if(edu.toLowerCase().equals("gr")){
                    System.out.println("your salary is 10000");
                }
            } else if (yrs < 10) {
                if (edu.toLowerCase().equals("pg")){
                    System.out.println("your salary is 10000");
                }else if(edu.toLowerCase().equals("gr")){
                    System.out.println("your salary is 7000");
                }
            }
        }else if(gender.toLowerCase().equals("female")){
            if (yrs >= 10){
                if (edu.toLowerCase().equals("pg")){
                    System.out.println("your salary is 12000");
                }else if(edu.toLowerCase().equals("gr")){
                    System.out.println("your salary is 9000");
                }
            } else if (yrs < 10) {
                if (edu.toLowerCase().equals("pg")){
                    System.out.println("your salary is 10000");
                }else if(edu.toLowerCase().equals("gr")){
                    System.out.println("your salary is 6000");
                }
            }
        }
    }
}
