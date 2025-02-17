import java.util.Scanner;
public class SumofOdd {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int from=inp.nextInt();
        int to=inp.nextInt();
        int c=0;
        for (int i=from;i<=to;i++){
            if (i%2 !=0){
                c+=i;
            }
        }
        System.out.println(c);
    }
}
