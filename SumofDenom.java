import java.util.Scanner;
public class SumofDenom {
    public static  void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        double sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+(1.0/i);
        }
        System.out.println(sum);
    }
}
