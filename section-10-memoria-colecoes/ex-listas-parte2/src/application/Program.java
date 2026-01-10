package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Diogo");
        list.add("Jaqueline");
        list.add("Mauricio");
        list.add(2, "Marco");

        System.out.println(list.size());

//        list.remove("Maria");
//        list.remove(1);

        for (String x : list) {
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("---------------------------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------------");
        System.out.println("Index of Diogo: " + list.indexOf("Diogo"));

        System.out.println("---------------------------");

        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'J')
                .collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------------");

        String name = list.stream()
                .filter(x -> x.charAt(0) == 'J')
                .findFirst()
                .orElse(null);

        System.out.println(name);
    }
}
