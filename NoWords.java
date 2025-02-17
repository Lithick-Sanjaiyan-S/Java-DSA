public class NoWords {
    public static void main(String[] args){
        String str="Hello Everyone good morning";
        int words=0;
        boolean inword=false;
        for (int i=0;i< str.length();i++){
            char crntword=str.charAt(i);
            if (crntword != ' ' && !inword){
                words++;
                inword=true;
            }
            else if(crntword == ' '){
                inword=false;
            }
        }
        System.out.println(words);
    }
}
