import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter val 1: ");
        int  a=inp.nextInt();
        System.out.println("Enter val 2: ");
        int  b=inp.nextInt();
        System.out.println("Enter operator: ");
        int  opr=inp.nextInt();
        int c=0;
        switch (opr){
            case 1:
                c=a+b;
                System.out.println("Added val "+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Sub val "+c);
                break;
            case 3:
                c=a*b;
                System.out.println("Product val "+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Divided val "+c);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
