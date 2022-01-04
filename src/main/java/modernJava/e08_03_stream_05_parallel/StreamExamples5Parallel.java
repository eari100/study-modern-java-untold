package modernJava.e08_03_stream_05_parallel;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamExamples5Parallel {
    public static void main(String[] args) {

        final int[] sum = {0};
        IntStream.range(0, 100)
                .forEach(i -> sum[0] += i);

        System.out.println("            stream sum (side-effect): " + sum[0]);

        final int[] sum2 = {0};
        IntStream.range(0, 100)
                .parallel()
                .forEach(i -> sum2[0] += i);

        System.out.println("          parallel sum (side-effect): " + sum2[0]);

        System.out.println("         stream sum (no side-effect): " +
                IntStream.range(0, 100)
                        .sum());

        System.out.println("parallel stream sum (no side-effect): " +
                IntStream.range(0, 100)
                        .parallel()
                        .sum());
    }
}
