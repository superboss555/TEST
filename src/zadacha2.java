import java.io.*;
import java.util.*;

public class zadacha2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> b = new ArrayList<>();
//        b.addAll(Arrays.asList(1, 8, 3, 5, 1, 9, 4, 6, 1, 8));
//        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s =reader.readLine();
            if (s.isEmpty()) break;
            b.add(Integer.parseInt(s));
        }

        Collections.sort(b);
        System.out.println(b.toString());
    }


}
