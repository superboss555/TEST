import java.io.*;
import java.util.*;

public class zadacha1 {
    public static void main (String [] args){
        int [] myArray = new int [10];
        myArray [0]= 1;
        for ( int i = 0; i < myArray.length; i++){
            myArray[i] = i+1;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int j = myArray.length-1; j >=0; j--){
            System.out.print(myArray[j] + " ");
        }
    }
}
