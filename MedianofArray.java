import java.util.*;
public class MedianofArray {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int len=inp.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=inp.nextInt();
        }
        int temp=0;
        for(int j=0;j<len;j++){
            for (int k=j+1;k<len;k++){
                if (arr[j]>arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        if (len%2 != 0){
            System.out.println(arr[len/2]);
        }else{
            float val=((arr[(len/2)-1]+arr[len/2]));
            System.out.println(val/2);
        }
    }
}
