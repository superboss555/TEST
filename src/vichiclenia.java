import java.io.*;
import java.util.*;

public class vichiclenia {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       double c = (a*a*a*b)/(b*b*b*a)*1000;
       System.out.println(c);
    }
}
