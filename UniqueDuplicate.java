import java.util.*;
public class UniqueDuplicate {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int size=inp.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        HashMap<Integer,Integer> uni=new HashMap<Integer, Integer>();
        for(int num: arr){
            uni.put(num, uni.getOrDefault(num,0)+1);
        }
        for(int key: uni.keySet()){
            if(uni.get(key)<2){
                System.out.println("The Unique duplicate value in the array is: "+key);
                return;
            }
        }
        System.out.println("There is no unique duplicate value in the array");
    }
    }

