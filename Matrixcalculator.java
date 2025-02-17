import java.util.*;
public class Matrixcalculator {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter row");
        int row=inp.nextInt();
        System.out.println("Enter col");
        int col=inp.nextInt();
        int[][] arr=new int[row][col];
        int[][] arr1=new int[row][col];
        int[][] res=new int[row][col];
        System.out.println("Values for matrix 1:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("Values for matrix 2:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr1[i][j]=inp.nextInt();
            }
        }
        System.out.println("Enter performance:");
        int per=inp.nextInt();
        switch (per){
            case 1:
                for(int i=0;i<row;i++){
                    for (int j=0;j<col;j++){
                        res[i][j]=arr[i][j]+arr1[i][j];
                    }
                }
                break;
            case 2:
                for(int i=0;i<row;i++){
                    for (int j=0;j<col;j++){
                        res[i][j]=arr[i][j]-arr1[i][j];
                    }
                }
                break;
            case 3:
                for(int i=0;i<row;i++){
                    for (int j=0;j<col;j++){
                        for(int k=0;k<row;k++){
                        res[i][j]+=arr[i][k]*arr1[k][j];
                        }
                    }
                }
                break;
        }
        System.out.println("Result matrix:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println(res[i][j]);
            }
        }
    }
}
