import java.util.*;
public class checkPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean res = checkPermutation(str1, str2);
        if(res == true){
            System.out.println("Given strings " + str1 + " and " + str2 + " are permutation of each other.");
        }else{
            System.out.println("Given strings " + str1 + " and " + str2 + " are not permutation of each other.");
        }

    }
    static boolean checkPermutation(String s1, String s2){
        char[] st1 = s1.toCharArray();
        char[] st2 = s2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        if(st1.length != st2.length) return false;

        else{
            for(int i =0 ; i < st1.length; i++){
                if(st1[i] != st2[i]) return false;
            }
        }
        return true;
    }

}
