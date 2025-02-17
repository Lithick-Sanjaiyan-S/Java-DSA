import java.util.Scanner;
public class NormofMatrix {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter row");
        int row=inp.nextInt();
        System.out.println("Enter col");
        int col=inp.nextInt();
        int[][] arr=new int[row][col];
        int sqr=0;
        System.out.println("Values for matrix :");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                sqr+=arr[i][j]*arr[i][j];
            }
        }
        System.out.print(Math.sqrt(sqr));
    }
}
