import java.util.Scanner;
public class Merge2SortedArrays {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("len of arr1 :");
        int len=inp.nextInt();
        System.out.print("len of arr2 :");
        int len2=inp.nextInt();
        int[] arr=new int[len];
        int[] arr2=new int[len2];
        int[] merged=new int[len+len2];
        System.out.println("Value of arr 1");
        for(int i=0;i<len;i++){
            System.out.println("Enter array values :");
            arr[i]= inp.nextInt();
        }
        System.out.println("Value of arr 2");
        for(int i=0;i<len2;i++){
            System.out.println("Enter array values :");
            arr2[i]= inp.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            merged[i]=arr[i];
        }
        int k=0;
        for (int j=arr.length;j<(arr.length+arr2.length);j++){
            merged[j]=arr2[k];
            k++;
        }
        for (int i=0;i<merged.length;i++){
            for(int j=i+1;j<merged.length;j++){
                if(merged[i]>merged[j]){
                    int temp;
                    temp=merged[i];
                    merged[i]=merged[j];
                    merged[j]=temp;
                }
            }
        }for (int i=0;i<merged.length;i++){
            System.out.print(merged[i]);
        }
    }
}
