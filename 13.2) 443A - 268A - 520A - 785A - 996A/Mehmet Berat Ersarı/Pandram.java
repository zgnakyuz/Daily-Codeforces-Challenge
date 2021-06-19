import java.util.*;

public class Pandram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        Hashtable<String, Integer> stringHash = new Hashtable<String, Integer>();
        for(int i=0; i<s.length(); i++){
            if(stringHash.size() == 0){
                stringHash.put(Character.toString(s.charAt(i)).toLowerCase(Locale.ROOT), 1);
            }
            else{
                if(! stringHash.contains(Character.toString(s.charAt(i)).toLowerCase(Locale.ROOT)) ){
                    stringHash.put(Character.toString(s.charAt(i)).toLowerCase(Locale.ROOT), 1);
                }
                else{
                    int count = stringHash.get(s.charAt(i));
                    stringHash.put(Character.toString(s.charAt(i)).toLowerCase(Locale.ROOT), count++);
                }
            }
        }
        if(stringHash.size()==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}


