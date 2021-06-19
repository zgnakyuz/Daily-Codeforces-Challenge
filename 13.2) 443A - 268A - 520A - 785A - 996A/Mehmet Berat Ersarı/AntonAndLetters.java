import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.replaceAll("}","");
        str=str.replaceAll("\\{","");
        String[] berat= str.split(", ");
        HashSet<String> size=new HashSet<>();
        for(String temp: berat){
            if(!temp.equals(""))
                size.add(temp);
        }
        System.out.println(size.size());

    }
}


