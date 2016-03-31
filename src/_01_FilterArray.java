import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class _01_FilterArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] text = scn.nextLine().split(" ");

        Arrays.stream(text)
                .filter(p -> p.length() > 3)
                .forEach(e -> System.out.print(e + " "));
        }
    }
