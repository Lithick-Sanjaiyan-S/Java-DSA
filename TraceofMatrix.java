import java.util.Scanner;
public class TraceofMatrix {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter row");
        int row=inp.nextInt();
        System.out.println("Enter col");
        int col=inp.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Values for matrix :");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        int sum=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}
