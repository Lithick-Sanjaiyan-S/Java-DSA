import java.util.Scanner;
public class MinandMax {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int row=inp.nextInt();
        int col=inp.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        int max=arr[0][0];
        int min=arr[0][0];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
                if (min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println(min+" "+max);
    }
}
