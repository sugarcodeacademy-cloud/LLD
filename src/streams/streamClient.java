package streams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamClient {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 2, 7, 3, 4, 6,10, 1, 9, 8, 9, 12);

        //step1: Open a stream
        Stream<Integer> stream = list.stream();

        //Step2: manipulations
//        stream
//                .filter(x -> x %2 == 0) // 12, 2, 4, 6, 10, 8, 12
//                .map(x -> x*x)// 144, 4, 16, 36, 100, 64, 144
//                .sorted() // 4, 16, 36, 64, 100, 144, 144
//                .distinct()// last 144 is removed
//                //.collect(Collectors.toList()); // 4, 16, 36, 64, 100, 144
//                //.toList()
//                .forEach(System.out::println);

            Optional<Integer> first = stream
                                        .filter(x -> x %2 == 0) // 12, 2, 4, 6, 10, 8, 12
                                        .map(x -> x*x)// 144, 4, 16, 36, 100, 64, 144
                                        .sorted() // 4, 16, 36, 64, 100, 144, 144
                                        .findAny(); //Shortcircuit method
                                        //.findLast()



        System.out.println(first.isPresent());

        System.out.println(first);


        System.out.println(list);
    }
}
