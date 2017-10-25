
public class PalindromeDriver
{
    public static void main(String args[]) {
        Palindrome pal = new Palindrome("racecar");
        System.out.println("The word is " + pal.word);
        System.out.println("Palindrome: " + pal.testPalindrome());
    }
}
