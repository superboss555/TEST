import java.io.*;
import java.util.*;

public class zadacha2 {
    public static void main (String[] args){
        int [] a = {1,8,3,5,1,9,4,6,1,8};
        boolean ready = false;
        int c;
        while (! ready ){
            ready = true;
            for (int i = 0; i < a.length - 1; i++){
                if (a[i] > a[i+1]){
                    ready = false;

                    c = a[i];
                    a[i] = a[i+1];
                    a[i+1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
        int [] b = {1,9,3,5,1,9,4,6,1,8};
        boolean it = false;
        int d;
        while(!it) {
            it = true;
            for (int i = 0; i < b.length-1; i++) {
                if(b[i] < b[i+1]){
                    it = false;

                    d = b[i];
                    b[i] = b[i+1];
                    b[i+1] = d;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
