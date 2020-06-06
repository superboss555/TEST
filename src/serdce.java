import java.io.*;
import java.util.*;


public class serdce
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           for (int i = -3*n/2; i <= n; i++) {
               for (int j = -3*n/2; j <= 3*n/2; j++ ){

               if ((Math.abs(i) + Math.abs(j) < n)
               || ((-n/2-i) * (-n/2 -i) + (n/2-j) * (n/2-j)
                  <= n*n/2)
               || ((-n/2-i) * (-n/2-i) + (-n/2-j) * (-n/2-j)
                  <= n*n/2)){
               System.out.print("0 ");

               }
               else {
                  System.out.print(". ");
              }
            }
            System.out.println();
        }
    }
}

