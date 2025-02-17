public class reversepattern {
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            for (int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            int x=1;
            for (int k=1;k<=i;k++){
                System.out.print(k);
                x++;
            }
            System.out.println();
        }
    }
}
