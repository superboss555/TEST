import java.io.*;
import java.util.*;

public class ifandelse {
    public static void main(String[] args){
        int a = 43875;
        int b = 56481;
        int c = 304;

        if (a > b && a > c){
            System.out.println("a-max");
        }
        if (b > a &&  b > c){
            System.out.println("b-max");
        }
        if (c > a && c  >b) {
            System.out.println("c-max");
        }


    }

}
