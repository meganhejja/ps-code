package packageLoader;

import java.util.*;

public class packageLoader {
    
    public static String createOrderedList(String[] inputs) {
        String [][] parsedEntries = new String [inputs.length][2];
        String outputString = "";
        for(int i = 0; i < inputs.length; i++) { 
            parsedEntries[i] = inputs[i].trim().split(":");
            if (parsedEntries[i].length == 1){
                outputString += parsedEntries[i][0].trim();
            } else {
                outputString += parsedEntries[i][1].trim() + ", " + parsedEntries[i][0].trim();
                }
            if (i < inputs.length - 1) {
                outputString += ", ";
            }
        }

        return outputString;
    }
       
}