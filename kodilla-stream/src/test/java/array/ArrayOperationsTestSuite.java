package array;

import com.kodilla.stream.forumuser.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        int[] numbers = {15, 28, 29, 33, 37, 42, 45, 49, 54, 58, 59, 66, 78, 83, 84, 89, 90, 95, 97, 100};

        Assert.assertEquals(61.55, ArrayOperations.getAverage(numbers), 0.1);

    }
    @Test
    public void testGetAverageEmpty(){
        int [] numbers={};
        Assert.assertEquals(0, ArrayOperations.getAverage(numbers),  0.1);
    }
}
