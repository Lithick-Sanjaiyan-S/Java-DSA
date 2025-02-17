import java.util.Arrays;
public class SizeOfArray {
    public static void main(String[] args){
        int a=10;
        int[] array= {1,2,3,4,5};
        int c=0;
        for (int i=0; i< array.length; i++){
            c+=1;
        }
        System.out.println("int"+Integer.SIZE);
        System.out.println(Arrays.toString(array));
        System.out.println("Size "+c);
        double num=7.5;
        System.out.println(num);
        final int d =10;
        char _variable='a';
        char $myvar='b';
        System.out.println($myvar);
        System.out.println(5/2);
        System.out.println(5%2);
    }
}
