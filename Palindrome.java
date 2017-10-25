
public class Palindrome
{
    String word;
    boolean isPalindrome;
    boolean comparingLetters = true;
    int letter;
    int lastLetter;
    
    public Palindrome(String wd) {
        this.word = wd;
    }
    
    public boolean testPalindrome() {
        int lastLetter = (word.length() - 1);
        String firstChar;
        String lastChar;
        for(int i = 0; i < (word.length()/2); i++) {
            firstChar = word.substring(letter, letter+1);
            if(i == 0) {
                 lastChar = word.substring(lastLetter);
              }
              else {
                  lastChar = word.substring(lastLetter, lastLetter+1);
               }
             
             System.out.println(firstChar + " " + letter);
             System.out.println(lastChar + " " + lastLetter);  
             
            if(firstChar.equals(lastChar)) {
                 letter++;
                 lastLetter--;
                 System.out.println("true");
              }
             else {
                 System.out.println("false");
                }
         }
        System.out.println(lastLetter);
        System.out.println(word.length()/2);
        if(lastLetter + 1 == word.length()/2 && (word.length()%2 == 0) || lastLetter == word.length()/2 && word.length()%2 ==1) {
            isPalindrome = true;
         }
        return isPalindrome;
    }
}
