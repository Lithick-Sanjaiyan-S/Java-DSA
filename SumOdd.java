import java.util.Scanner;
public class SumOdd {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int len=inp.nextInt();
        int[] arr=new int[len];
        int sum=0;
        int prd=1;
        for(int i=0;i<len;i++){
            arr[i]=inp.nextInt();
            sum=sum+arr[i];
            prd=prd*arr[i];
        }
        if (sum%2==0){
            System.out.println(sum);
        }else if(sum%2 != 0){
            System.out.println(prd);
        }
    }
}
