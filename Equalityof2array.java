public class Equalityof2array {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,5,6};
        int[] arr1={1,2,3,4,5,6,5,6};
        int n=arr.length;
        int c=0;
        if (n != arr1.length){
            System.out.println("enter valid array");
        }else{
            for (int i=0;i<n;i++){
                if(arr[i] == arr1[i]){
                    c++;
                }
            }if (c==arr.length){
                System.out.println("Both arrays are equal");
            }else{
                System.out.println("Arrays are not equal");
            }
        }
    }
}
