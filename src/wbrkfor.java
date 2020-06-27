import java.io.*;
import java.util.*;

public class wbrkfor {
    public static void main (String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int sum = 0;
        if (a > 0){
            for (int i = 1; i <=a; i++ ){
                 sum = sum + i;
        }
        }
        System.out.print(sum);
    }
}
