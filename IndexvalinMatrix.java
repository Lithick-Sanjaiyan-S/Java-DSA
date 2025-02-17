import java.util.*;
public class IndexvalinMatrix {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter row");
        int row=inp.nextInt();
        System.out.println("Enter col");
        int col=inp.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter Target :");
        int target=inp.nextInt();
        System.out.println("Values for matrix :");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(arr[i][j] == target){
                    System.out.println("Target found at the index of ["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}
