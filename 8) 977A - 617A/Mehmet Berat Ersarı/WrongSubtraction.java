import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int n= sc.nextInt();
        for(int i=0; i<n;i++){
            String numberString= String.valueOf(number);
            if(Character.getNumericValue(numberString.charAt(numberString.length()-1))==0){
                number=number/10;
            }else
                number-=1;
        }
        System.out.println(number);
    }
}
