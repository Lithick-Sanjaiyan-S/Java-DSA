import java.util.Scanner;
public class Foursum {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter size :");
        int len=inp.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            System.out.println("Enter array values :");
            arr[i]= inp.nextInt();
        }
        int sum=0;
        System.out.println("Enter target: ");
        int target=inp.nextInt();
        for (int i=0;i<len-3;i++){
            for(int j=i+1;j<len-2;j++){
                for (int k=j+1;k<len-1;k++){
                    for (int l=k+1;l<len;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]  == target){
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
                            break;
                        }
                    }
                }
            }
        }
    }
}
