import java.util.Locale;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word=sc.next();
        int upperCaseCounter=0;
        for(int i=0; i<word.length();i++){
            if(String.valueOf(word.charAt(i)).equals(String.valueOf(word.charAt(i)).toUpperCase(Locale.ROOT))){
                upperCaseCounter++;
            }
        }
        if(upperCaseCounter>word.length()-upperCaseCounter){
            word=word.toUpperCase(Locale.ROOT);
        }else
            word=word.toLowerCase(Locale.ROOT);
        System.out.println(word);
    }
}
