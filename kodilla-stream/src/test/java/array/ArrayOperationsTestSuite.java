package array;

import com.kodilla.stream.forumuser.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        int[] numbers = {15, 28, 29, 33, 37, 42, 45, 49, 54, 58, 59, 66, 78, 83, 84, 89, 90, 95, 97, 100};

        Assert.assertEquals(ArrayOperations.getAverage(numbers), 61.55, 0);

    }
}
