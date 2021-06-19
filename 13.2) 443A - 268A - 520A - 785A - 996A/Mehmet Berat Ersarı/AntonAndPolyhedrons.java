import java.util.*;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Hashtable<String, Integer> stringHash = new Hashtable<String, Integer>();
        stringHash.put("Tetrahedron",4);
        stringHash.put("Cube",6);
        stringHash.put("Octahedron",8);
        stringHash.put("Dodecahedron",12);
        stringHash.put("Icosahedron",20);
        int counter=0;
        for(int i=0;i<n;i++){
            counter+=stringHash.get(sc.nextLine());
        }
        System.out.println(counter);


    }
}


