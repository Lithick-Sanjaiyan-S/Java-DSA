import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Number:");
        int Number= inp.nextInt();
        if (Number%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
