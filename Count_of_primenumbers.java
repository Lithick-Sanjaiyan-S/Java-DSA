import java.util.Scanner;
public class Count_of_primenumbers {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int from=inp.nextInt();
        int to=inp.nextInt();
        int c=0;
        for (int i=from;i<to;i++){
            boolean prime=true;
            if (i<=1){
                prime=false;
            }
            else{
                for (int j=2;j<=Math.sqrt(i);j++){
                    if (i%j ==0){
                        prime= false;
                        break;
                    }
                }
            }
            if(prime){
                System.out.println(i + " ");
                c+=1;
            }
        }
        System.out.println("total prime numbers are "+c);
    }
}
