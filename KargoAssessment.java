import java.io.*; 
import java.util.*; 
public class KargoAssessment {
    
    static int size = 256; 
    
    public static boolean mappingExists(String str1, String str2) {
        // length of both strings must be the same
        if(str1.length() != str2.length()) 
            return false; 
              
        // to mark visited characters in str2 
        Boolean[] visited = new Boolean[size]; 
        Arrays.fill(visited, Boolean.FALSE); 
          
        // to store mapping of every character from str1 to 
        // that of str2: initialize all entries of map as -1. 
        int [] map = new int[size]; 
        Arrays.fill(map, -1); 
          
        for (int i = 0; i < str1.length(); i++) { 
            // if current character of str1 is seen first time
            if (map[str1.charAt(i)] == -1) { 
                // mark current character of str2 as visited 
                visited[str2.charAt(i)] = true; 
  
                // store the mapping of current chars 
                map[str1.charAt(i)] = str2.charAt(i); 
            } 
  
            // If this is not first appearance of current char in str1, then check if previous 
            // appearance is mapped to same character of str2 
            else if (map[str1.charAt(i)] != str2.charAt(i)) 
            	return false; 
        } 
        return true; 
    }
} 