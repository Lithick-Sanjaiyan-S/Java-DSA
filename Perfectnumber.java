public class Perfectnumber {
    public static void main(String[] args){
        int s=0;
        for (int i=1;i<=10000;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if (i%j==0){
                    sum+=j;
                }
            }if (sum==i){
                System.out.println(sum);
                s+=1;
            }
        }System.out.println(s);
    }
}
