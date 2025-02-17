import java.util.Scanner;
public class LenofArray {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the Size of the array :");
        int n=inp.nextInt();
        int[] arr1=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.println("Enter Values :");
            arr1[i]=inp.nextInt();
            sum+=arr1[i];
        }
        int val=arr1.length;
        if (val%2==0){
            System.out.println("sum: "+sum);
        }else{
            System.out.println("Avg :"+sum/val);
        }
    }
}
