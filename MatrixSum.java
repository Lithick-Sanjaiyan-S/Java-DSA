import java.util.Scanner;
public class MatrixSum {
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
        int sum=0;

        for (int j=0;j<row;j++){
            for (int k=0;k<col;k++){
                sum+=arr[j][k];
            }
        }
        System.out.println("The sum is :"+sum);
    }
}
