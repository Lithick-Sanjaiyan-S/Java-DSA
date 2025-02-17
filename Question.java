import java.util.Scanner;
public class Question {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int sum1=0;
        for (int i=0;i<5;i++){
            int input= inp.nextInt();
            sum1+=input;
        }
        double avg=sum1/5;
        System.out.println("Sum is "+sum1);
        System.out.println("Average is "+avg);
    }
}
