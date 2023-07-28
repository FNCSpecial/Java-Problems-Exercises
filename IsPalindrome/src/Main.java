import java.util.*;

public class Main {

    static boolean isPalindrome(String word) {

        String backwards="";
        int size = word.length();

        for(int i = size-1; i>=0 ; i--) {
            backwards =backwards + word.charAt(i);
        }
        if(backwards.equals(word)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("test"));
        System.out.println(isPalindrome("kamilslimak"));
    }
}