import  java.util.Scanner;
public class Checkingarray {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,5,6};
        System.out.println("Enter target :");
        int target=inp.nextInt();
        int c=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target){
                System.out.println(("Element found :"+target));
                c++;
            }
        }
        System.out.println("repeated: "+c);
    }
}
