import java.util.HashMap;
import java.util.Map;

public class arrayReverse {
    public static void main(String[] args) {
        String str1 = "abcdABCDabcd";

        char[] chars = str1.toCharArray();

        Map<Character, Integer> charsCount = new HashMap<>();

        for(char c : chars) {
            if(charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c)+1);
            }else
                charsCount.put(c, 1);
        }

        System.out.println(charsCount); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
    }
    }
    /////////////////////////////////////////
       /* String in = "12345";
        System.out.println(reverse(in));
    }

    public static String reverse(String in) {
        if(in==null) {
            throw new IllegalArgumentException("in must not be null");
        }
        StringBuilder out= new StringBuilder();
        char[] chars=in.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            out.append(chars[i]);
        }
        return out.toString();
    }*/
//}
