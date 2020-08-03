
public class Main {

	public static void main(String[] args) {
		Solution myS =new Solution();
		
		
		System.out.println(myS.isPalindrome("A man, a plan, a canal: Panama"));
		

	}

}

class Solution {
    public boolean isPalindrome(String s) {
        int newLetter = 0;
        String word = "";
        
        while (newLetter < s.length()) {
        	if (Character.isLetterOrDigit(s.charAt(newLetter))) {
        		word = word + s.charAt(newLetter);
        	}
        	newLetter ++; 
        }
         word= word.toLowerCase();
    	
         String newWord = "";
         int letter  = word.length() -1;
         while (letter >= 0) {
         	if (Character.isLetterOrDigit(word.charAt(letter))) {
         		newWord = newWord + word.charAt(letter);
         	}
         	
             letter--;
         }

        if (newWord.equals(word)){
            return true;
        } else {
            return false;
        }
 
        
    }
}
