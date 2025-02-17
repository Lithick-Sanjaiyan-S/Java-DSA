import java.util.Scanner;
public class Indexofele {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Size");
        int n=inp.nextInt();
        System.out.println("Target");
        int index=inp.nextInt();
        int[] arr1=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter Values :");
            arr1[i]=inp.nextInt();
        }
        for (int j=0;j<arr1.length;j++){
            if (arr1[j]==index){
                System.out.println("found at :"+j);
            }
        }
    }
}
