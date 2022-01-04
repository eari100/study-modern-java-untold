package modernJava.e08_03_stream_01;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples1 {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(i -> System.out.print(i + " "));

        // int를 이용한 무한 Collection
        IntStream.iterate(1, i -> i + 1)
                .forEach(i -> System.out.print(i + " "));

        // BigInteger를 이용한 무한 Collection
        Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .forEach(i -> System.out.print(i + " "));
    }
}
