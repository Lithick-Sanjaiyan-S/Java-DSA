public class Copyarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,5,6};
        int[] arr2=new int[arr.length];
        int n=arr.length;
        for (int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        for (int j=0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }

    }
}
