import java.io.*;
import java.util.*;

public class treugolnik {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j;
        for ( i = 0 ; i <= n; i++){
            for ( j = 0; j<n-i; j++){


                System.out.print("  ");
            }
            for (j = i; j > 0; j--){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
