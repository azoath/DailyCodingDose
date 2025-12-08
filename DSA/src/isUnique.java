import java.util.*;

public class isUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = isUnique(str);
        if(result == true){
        System.out.println("The " + str + "is unique");
        }else{
            System.out.println("The " + str + "is not unique");
        }
    }

    public static boolean isUnique(String str) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        for (int i = 0; i < s.length-1; i++) {
            if (s[i] == s[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
