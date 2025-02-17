import java.util.Scanner;
public class MagicSquare {
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
        int valid=0;
        for (int j=0;j<col;j++){
            valid+=arr[0][j];
        }
        for (int i=0;i<row;i++){
            int rowsum=0;
            for (int j=0;j<col;j++){
                rowsum+=arr[i][j];
            }
            if (rowsum != valid){
                System.out.println("Not a magic square");
                return;
            }
        }
        for (int j=0;j<col;j++){
            int colsum=0;
            for (int i=0;i<row;i++){
                colsum+=arr[i][j];
            }
            if (colsum != valid){
                System.out.println("Not a magic square");
                return;
            }
        }
        int maindiag=0;
        int sidediag=0;
            for (int i = 0; i < row; i++) {
                maindiag += arr[i][i];
                sidediag+=arr[i][row-1-i];
                }
            if (maindiag!=valid){
                System.out.println("Not a magic square");
                return;
            }
            if (sidediag!=valid){
                System.out.println("Not a magic square");
                return;
            }
        System.out.print("It is a magic square");
        }
        }
