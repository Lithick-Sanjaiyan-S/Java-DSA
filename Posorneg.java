import java.util.Scanner;
public class Posorneg {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int x=inp.nextInt();
        if (x>0){
            System.out.println("Positive");
        }
        else if (x==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }

    }
}
