package packageLoader;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class packageLoaderTest{
      
    @Test
    public void whenGivenAnArrayOfOneValueNoDependenciesItShouldReturnThatValue() {
        String [] testInput = new String [] {"Megan Package:"};
        assertEquals("Megan Package", packageLoader.createOrderedList(testInput));
    }
    
    @Test
    public void whenGivenAnArrayOfOneValueWithDependenciesItShouldReturnValueCommaDependency() {
        String [] testInput = new String [] {"KittenService: CamelCaser"};
        assertEquals("KittenService, CamelCaser", packageLoader.createOrderedList(testInput));
    }
    
    @Test
    public void whenGivenAnArrayOfTwoValuesWithNoDependenciesItShouldReturnValueCommaValue() {
        String [] testInput = new String [] {"KittenService: ", "CamelCaser: "};
        assertEquals("KittenService, CamelCaser", packageLoader.createOrderedList(testInput).toString());
    }
}