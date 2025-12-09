import java.util.*;

public class URLify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int truLength = sc.nextInt();

        System.out.println(URLify(str, truLength));
    }

    public static String URLify(String str, int trueLength){
        char[] ch = str.toCharArray();
        int index = ch.length - 1;
        
        for(int i = trueLength - 1; i >= 0; i--){
            if(ch[i] == ' '){
                ch[index] = '0';
                ch[index-1] = '2';
                ch[index-2] = '%';
                index -= 3;
            } else {
                ch[index] = ch[i];
                index--;
            }
        }
        return new String(ch);
    }
}
