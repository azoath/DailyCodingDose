import java.util.*;
public class oneAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res = oneAway(str1, str2);
        if(res == true){
            System.out.println("The given strings \"" + str1 + "\" and \"" + str2 + "\" are one edit away.");
        }else{
            System.out.println("The given strings \"" + str1 + "\" and \"" + str2 + "\" are not one edit away.");
        }
    }
    public static boolean oneAway(String str1, String str2){
        int length1 = str1.length();
        int length2 = str2.length();

        if(Math.abs(length1 - length2) > 1 || Math.abs(length2 - length1) > 1){
            return false;
        }
        int charCount = 0;
        for(int i = 0; i < str1.length()-1; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                charCount++;
        }
        if(charCount > 1){
            return false;
        }
    }
        return true;
    }
}
