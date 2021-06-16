import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b=sc.next();

        int[] array= new int[a.length()];
        for(int i=0;i<a.length();i++){
            if(Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))==2 || Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i))==0) {
                array[i] = 0;
            }
            else
                array[i] = 1;
        }
        for(int temp: array){
            System.out.print(temp);
        }



    }
}
