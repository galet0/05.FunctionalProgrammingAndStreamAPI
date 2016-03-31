import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class _02_SortArrayWithStreamAPI {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] input = scn.nextLine().split(" ");
        String cmd = scn.next();
        Stream.of(input)
                .map(e -> Integer.parseInt(e))
                .sorted((e1,e2) -> cmd.equals("Ascending")? e1.compareTo(e2):
                        e2.compareTo(e1))
                .forEach(e -> System.out.print(e + " "));
   }
}
