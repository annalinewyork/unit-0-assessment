package nyc.c4q;

/**
 * Created by c4q-nali on 4/20/15.
 */
public class test {
    public static void main(String[] args) {
        returnStringUntilQ("xxqbb");
    }

    public static String returnStringUntilQ(String input) {

        char target = 'q';
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char findChar = input.charAt(i);
            result = input.substring(0,i);

            if (findChar == target) {
                System.out.println(result);
            } else
                System.out.println();
        }
        return result;
    }
}
