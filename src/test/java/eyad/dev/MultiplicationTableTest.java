package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {
     @Test
    void testMultiply() {
        List<Integer> expected = List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        List<Integer> result = MultiplicationTable5.multiply(5);
        assertEquals(expected, result);

    }
}
