import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int red=scanner.nextInt();
        int blue=scanner.nextInt();
        int total=0;
        int other=0;
        if(red>=blue){
            while (red>=blue){
                red-=1;
                blue-=1;
                total++;
                if(blue==0){
                    break;
                }
            }
            if(red>=2){
                while (red>=2){
                    red-=2;
                    other++;
                    if (red==0){
                        break;
                    }
                }
            }
        }
        else {
            while (blue>red){
                blue-=1;
                red-=1;
                total++;
                if(red==0){
                    break;
                }
            }
            if(blue>=2){
                while (blue>=2){
                    blue-=2;
                    other++;
                    if(blue==0){
                        break;
                    }
                }
            }
        }
        System.out.println(total+" "+other);
    }
}
