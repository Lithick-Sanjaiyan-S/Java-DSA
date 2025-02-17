import java.util.Scanner;
public class Arrays2D {
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
            for (int j=0;j<col;j++){
                System.out.println("Array elements are:");
                System.out.println(arr[i][j]);
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if ((i==j) || (i+j==col-1)) {
                    System.out.println("Index values are:");
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
