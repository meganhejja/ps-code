package packageLoader;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class packageLoaderTest{
      
    @Test
    public void whenGivenAnArrayOfOneValueItShouldReturnThatValue() {
        String [] testInput = new String [] {"Megan Package:"};
        assertEquals("Megan Package", packageLoader.createOrderedList(testInput));
    }
}