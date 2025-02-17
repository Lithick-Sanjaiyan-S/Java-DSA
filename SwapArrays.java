import java.util.*;
public class SwapArrays {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("len of arr1 :");
        int len=inp.nextInt();
        System.out.print("len of arr2 :");
        int len2=inp.nextInt();
        int[] arr=new int[len];
        int[] arr2=new int[len2];
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
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr2[0]){
                int temp=arr[i];
                arr[i]=arr2[0];
                arr2[0]=temp;
            }
            int c=arr2[0];
            for(int j=1;j<arr2.length;j++){
                if(arr2[j]>c){
                    int temp=c;
                    c=arr2[j];
                    arr2[j]=c;
                }
            }
        }
        System.out.println("Thee sorted arrays are : "+(Arrays.toString(arr))+" "+(Arrays.toString(arr2)));
    }
}
