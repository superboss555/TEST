import java.io.*;
import java.util.*;

public class kombo1 {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("число а");
        int a = m.nextInt();
        System.out.println("число b");
        int b = m.nextInt();
        System.out.println("число c");
        int c = m.nextInt();
        int d = a + b + c;
        System.out.println(d + "=d;");
        int e = (a+b) * c;
        System.out.println(e + "=e;");
        int f = a * b * c;
        System.out.println(f + "=f;");
        int g = a*c + b*10;
        System.out.println(g + "=g;");

        if (d > e && d>f && d>g ){
            System.out.println("d-max");
        }
        if (e > d && e>f && e>g ){
            System.out.println("e-max");
        }
        if (f > e && f>d && f>g ){
            System.out.println("f-max");
        }
        if (g > e && g>f && g>d ){
            System.out.println("g-max");
        }
    }
}
