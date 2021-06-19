import java.util.*;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a=sc.nextLine().split("");
        String[] b=sc.nextLine().split("");
        String[] c=sc.nextLine().split("");
        int control=a.length+b.length;
        int control3=c.length;
        boolean control2=false;
        ArrayList<String> c2 = new ArrayList<>(Arrays.asList(c));
        for (String s : a) {
            if (c2.contains(s)) {
                try {
                    c2.remove(s);
                } catch (Exception e) {
                    control2 = true;
                    break;
                }
            }else{
                control2 = true;
                break;
            }
        }
        for (String s : b) {
            if (c2.contains(s)) {
                try {
                    c2.remove(s);
                } catch (Exception e) {
                    control2 = true;
                    break;
                }
            }else{
                control2 = true;
                break;
            }
        }
        if(control2 || control3>control){
            System.out.println("NO");
        }else
            System.out.println("YES");
    }
}


