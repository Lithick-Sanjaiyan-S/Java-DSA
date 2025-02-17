import java.util.*;
public class UniqueDuplicate2 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int size=inp.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        boolean found=false;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                if (i==0 || arr[i]!=arr[i-1]){
                    System.out.println("The duplicate value is "+arr[i]);
                    found=true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("There is no duplicate");
        }
    }
}
