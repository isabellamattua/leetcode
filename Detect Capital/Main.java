
public class Main {

	public static void main(String[] args) {
		Solution myS =new Solution();
		
		System.out.println(myS.detectCapitalUse("Leetcode"));
	
		

	}

}

class Solution {
    public boolean detectCapitalUse(String word) {
    	
    	String checkWord = "";
    	
    	checkWord = word.toLowerCase();
    	//System.out.println(checkWord);
    	if (checkWord.equals(word))
    		return true;
    	
    	checkWord = word.toUpperCase();
    	//System.out.println(checkWord);
    	if (checkWord.equals(word))
    		return true;
    	
    	char firstLetter = Character.toUpperCase(word.charAt(0));
    	checkWord = word.toLowerCase();
    	checkWord = firstLetter+ checkWord.substring(1); 
    	
    	
    	System.out.println(checkWord);
    	if (checkWord.equals(word))
    		return true;
    				
    				
    	return false;

        
    }
}