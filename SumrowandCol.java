import java.util.Scanner;
public class SumrowandCol {
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
        for (int i=0;i<row;i++){
            int rowsum=0;
            for (int j=0;j<col;j++){
                rowsum+=arr[i][j];
            }
            System.out.println(rowsum);
        }
        for (int j=0;j<col;j++){
            int colsum=0;
            for (int i=0;i<row;i++){
                colsum+=arr[i][j];
            }
            System.out.println(colsum);
        }

    }
}

