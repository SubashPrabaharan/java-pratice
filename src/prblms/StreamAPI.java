package prblms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,2,1);
        Stream<Integer> data = list.stream();//take a copy of list
//
        Stream<Integer> mapData = data.map(i->i*2).sorted();

        mapData.forEach(i -> System.out.println(i));



    }
}
