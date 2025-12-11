import java.util.*;
public class palindromePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 

        boolean res = palindromePermutation(str);
        if(res == true){
            System.out.println("The given string \"" + str + "\" is a permutation of a palindrome.");           
        }else{
            System.out.println("The given string \"" + str + "\" is not a permutation of a palindrome.");
        }
    }
    public static boolean palindromePermutation(String str){
        int[] charCount = new int[128];
        for(char c : str.toCharArray()){
            if(c != ' '){
                charCount[c]++;
            }
        }
        int oddCount = 0;
        for(int count : charCount){
            if(count % 2 != 0){
                oddCount++;
            }
            if(oddCount > 1){
                return false;
            }
        }
        return true;
    }
}
