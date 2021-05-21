import java.util.Locale;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);
        int[][] matrix=new int[5][5];
        int x = 0;
        int y = 0;
        for(int i=0; i<5;i++){
            for(int j=0; j<5;j++){
                matrix[i][j]=lines.nextInt();
                if(matrix[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        int a=Math.abs(x-2);
        int b=Math.abs(y-2);
        System.out.println(a+b);

    }
    }

