package desafios.map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        List<Integer> numbers = Arrays.asList(
                0,1,2,3,4,5,6,7,8,9
        );

        List<Integer> finalList = numbers.stream()
                .map(Integer::toBinaryString)
                .map(StringFormatter::reverse)
                .map(n->Integer.parseInt(n,2))
                .collect(Collectors.toList());

        System.out.println(finalList);
    }
}
