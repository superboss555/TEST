import java.io.*;
import java.util.*;

public class zadacha3 {
    public static void main(String[] args) {

        double x;
        double t = 1;
        double y = 999;
        int n = 34;
        int b = 3;
        x = t / y;
//        x += 2 / (3 * y + 1) * 2;
//        x += 3 / (6 * y + 1) * 3;

        for (int i = 1; i < n; i++) {
            x += t*t/(b*y+1);
            t++;
            b+=3;



        }
        System.out.println(x);


    }
}
