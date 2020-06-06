import java.io.*;
import java.util.*;

public class vzlom {
    public static void main (String[] args){
        int x = 3;
        int y = 1;
        while (x < 203){
            System.out.print("Идет взлом Пентагона...");
            x++;
            System.out.println(y + "%");
            y++;
            System.out.println("Подождите...");
            x++;
        }
        System.out.println("Пентагон успешно взломан!");
        System.out.println("Файлы будут скоро загружены!");
    }
}
