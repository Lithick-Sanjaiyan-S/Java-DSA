import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int salary= inp.nextInt();
        double total=0.0;
        if (salary <= 10000){
            total=(salary+((20.0/100)*salary)+((80.0/100)*salary));
        } else if (salary <= 20000) {
            total=salary+((25.0/100)*salary)+((90.0/100)*salary);
        }else if(salary > 20000){
            total=salary+((30.0/100)*salary)+((95.0/100)*salary);
        }
        else{
            System.out.println("Enter valid salary");
        }
        System.out.println("The gross salary is "+total);
    }

}
