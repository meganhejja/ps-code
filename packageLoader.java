package packageLoader;

public class packageLoader {
    
    public static String createOrderedList(String[] inputs) {
        String firstEntry  = inputs[0].replace(":", "").trim();
        String secondEntry = inputs[1].replace(":", "").trim();
        
        return firstEntry + ", " + secondEntry;
    }
       
}