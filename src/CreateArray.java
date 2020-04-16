import java.lang.reflect.Array;
import java.util.Arrays;
public class CreateArray {
    public static void main(String[] args) {
            int[] numarray = new int[]{1, 21, 63, 4, 51};
            String[] StringArray = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            char[] charArray = new char[]{'a','e','i','o','u'};
            boolean[] boolArray = new boolean[]{true,false};
            System.out.println(Arrays.toString(numarray)+"\n"+Arrays.toString(StringArray)+"\n"+ Arrays.toString(charArray)+"\n"+Arrays.toString(boolArray));

    }
}
