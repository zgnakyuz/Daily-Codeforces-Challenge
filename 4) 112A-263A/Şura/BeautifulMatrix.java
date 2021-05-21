import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[][] array= new String[5][5];
        int first=0;
        int second=0;
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                array[i][j]=scanner.next();
                if(array[i][j].equals("1")){
                    first=i;
                    second=j;
                }
            }
        }
        System.out.println(Math.abs(first-2)+Math.abs(second-2));
    }
}
