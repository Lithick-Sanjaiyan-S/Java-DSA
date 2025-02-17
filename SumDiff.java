import java.util.Scanner;

public class SumDiff {
    public  static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        double sum=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                sum=sum+(1.0/i);
            }
            else{
                sum=sum-(1.0/i);
            }
        }
        System.out.println(sum);
    }
}
