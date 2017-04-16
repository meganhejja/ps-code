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
    public void whenGivenAnArrayOfOneValueWithDependenciesItShouldReturnDependencyValue() {
        String [] testInput = new String [] {"KittenService: CamelCaser"};
        assertEquals("CamelCaser, KittenService", packageLoader.createOrderedList(testInput));
    }
    
    @Test
    public void whenGivenAnArrayOfTwoValuesWithNoDependenciesItShouldReturnValueValue() {
        String [] testInput = new String [] {"KittenService: ", "CamelCaser: "};
        assertEquals("KittenService, CamelCaser", packageLoader.createOrderedList(testInput).toString());
    }
    
    @Test
    public void whenGivenAnArrayOfTwoValuesWithandWithoutDependenciesItShouldReturnDependencyDependencyValue() {
        String [] testInput = new String [] {"KittenService: CamelCaser", "CamelCaser: "};
        assertEquals("CamelCaser, KittenService", packageLoader.createOrderedList(testInput).toString());
    }
}